package com.datastax.verizoncrm;


public class GenerateMessages {

	public static void main(String[] args) throws InterruptedException {
		DataFactory df = new DataFactory();
		//DataStaxCluster dse = new DataStaxCluster(new String[]{"node0", "node1", "node2"}, "verizon");
		DataStaxCluster dse = new DataStaxCluster(new String[]{"node0"}, "verizon");
		//DataStaxCluster dse = new DataStaxCluster(new String[]{"52.207.216.231", "54.152.128.116"}, "verizon");
		
		for (int i=0; i<100000; i++){
				Message m = df.createMessage();
				Notification n = df.createNotification(m);
				Inbox in = df.createInbox(m);
				dse.saveData(m, n, in);
		}
		
		System.out.println("Data load complete.");
		//Wait 10 seconds for pending callbacks to complete.
		Thread.sleep(10000);
		dse.printStats();
		System.exit(0);

	}

}
