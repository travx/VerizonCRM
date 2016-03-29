package com.datastax.verizoncrm;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Cluster.Builder;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.Mapper.Option;
import com.datastax.driver.mapping.MappingManager;

public class DataStaxCluster {
	private String[] nodes;
	private String keyspace;
	private Cluster cluster;
	private Session session;
	
	private StatsFutureSet futures;
	
	//Mappers
	private Mapper<Notification> notification;
	private Mapper<Message> message;
	private Mapper<Inbox> inbox;
	
	public DataStaxCluster(String[] nodes, String keyspace){
		this.setNodes(nodes);
		this.setKeyspace(keyspace);
		
		futures = new StatsFutureSet(20, 100000, 100000);
		
		connect();
		prepare();
	}
	
	public void printStats(){
		futures.printStats();
	}
	
	private void connect(){
		Builder builder = Cluster.builder();
		builder.addContactPoints(nodes);
		cluster = builder.build();
		cluster.getConfiguration().getSocketOptions().setReadTimeoutMillis(100000);
		//cluster.getConfiguration().getPoolingOptions().setMaxConnectionsPerHost(HostDistance.LOCAL, 10);
		cluster.getConfiguration().getQueryOptions().setConsistencyLevel(ConsistencyLevel.ONE);
		session = cluster.connect(keyspace);		
	}
	
	private void prepare(){
		notification = new MappingManager(session).mapper(Notification.class);
		notification.setDefaultSaveOptions(Option.saveNullFields(false));
		
		message = new MappingManager(session).mapper(Message.class);
		message.setDefaultSaveOptions(Option.saveNullFields(false));
		
		inbox = new MappingManager(session).mapper(Inbox.class);
		inbox.setDefaultSaveOptions(Option.saveNullFields(false));
	}
	
	public void saveData(Message m, Notification n, Inbox in){
		futures.add(session.executeAsync(message.saveQuery(m)), "message_insert");
		futures.add(session.executeAsync(notification.saveQuery(n)), "notification_insert");
		futures.add(session.executeAsync(inbox.saveQuery(in)), "inbox_insert");

	}


	public void setNodes(String[] nodes) {
		this.nodes = nodes;
	}

	public void setKeyspace(String keyspace) {
		this.keyspace = keyspace;
	}	
}
