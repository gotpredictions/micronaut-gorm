CREATE TABLE services(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    create_time DATETIME COMMENT 'Create Time',
    update_time DATETIME COMMENT 'Update Time',
    svc_name VARCHAR(255) COMMENT 'Name of the service',
    metadata JSON COMMENT 'service json data',
    description TEXT
) DEFAULT CHARSET UTF8 COMMENT 'newTable';

insert into 
    services(create_time, update_time, svc_name, metadata, description)
    values(now(), now(), "Breach Engine", "[{}]", "Breach Engine Description");

insert into 
    services(create_time, update_time, svc_name, metadata, description)
    values(now(), now(), "Marketplaces", "[{}]", "Adhoc data to be used")
