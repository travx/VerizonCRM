CREATE KEYSPACE verizon WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '3'}  AND durable_writes = true;

CREATE TABLE verizon.pushnotif_input_transaction (
    tx_id text PRIMARY KEY,
    app_nm text,
    category_key text,
    content_string text,
    input_id text,
    mse_flow_id int,
    mse_flow_step int,
    mse_status int,
    mse_timestamp timestamp,
    mse_tx_id text,
    notify_processed_dt timestamp,
    notify_retry int,
    notify_serverid int,
    notify_status int,
    notify_type_id int,
    push_to_app text,
    recv_dt timestamp,
    remark text,
    request_id int,
    request_raw_id int,
    response_code text,
    response_desc text,
    sent_dt timestamp,
    sms_tx_id text,
    status_id int,
    trans_nm text,
    vzcom_userid text
);

CREATE TABLE verizon.message (
    tx_id text PRIMARY KEY,
    action text,
    action_code text,
    action_date timestamp,
    app_nm text,
    filter_category text,
    message text,
    message_actions text,
    message_expiry_ts timestamp,
    message_type text,
    priority int,
    recv_dt timestamp,
    remark text,
    sent_dt timestamp,
    short_message text,
    sms_tx_id text,
    status_id int,
    subject text,
    trans_nm text,
    vzcom_userid text
);

CREATE TABLE verizon.inbox (
    vzcom_userid text,
    priority int,
    recv_dt timestamp,
    tx_id text,
    short_message text,
    subject text,
    PRIMARY KEY (vzcom_userid, priority, recv_dt, tx_id)
) WITH CLUSTERING ORDER BY (priority ASC, recv_dt DESC, tx_id ASC)
    AND default_time_to_live = 7776000;

