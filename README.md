# parcel_point
## DB Configuration  ##

CREATE TABLE Agent (
    id BIGINT,
    name varchar(30),
    external_id varchar(30),
    address varchar(150),
    created_on Timestamp,
    updated_on timestamp,
 PRIMARY KEY (id)
);

CREATE TABLE user (
    id BIGINT,
    email varchar(150),
    first_name varchar(40),
    last_name varchar(40),
    address varchar(150),
    created_on Timestamp,
    updated_on timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE retailer(
    id BIGINT,
    name varchar(30),
    created_on Timestamp,
    updated_on timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE carrier(
    id BIGINT,
    name varchar(30),
    created_on Timestamp,
    updated_on timestamp,
    PRIMARY KEY (id)
);
CREATE TABLE parcel(
    id BIGINT,
    external_id varchar(50),
    created_on Timestamp,
    updated_on timestamp,
type varchar(100),
status varchar(100),

user_id BIGINT,
agent_id BIGINT,
retailer_id BIGINT,
carrier_id BIGINT,
    PRIMARY KEY (id),
FOREIGN KEY (user_id) REFERENCES user (id),
FOREIGN KEY (agent_id) REFERENCES Agent (id),
FOREIGN KEY (retailer_id) REFERENCES retailer(id),
FOREIGN KEY (carrier_id) REFERENCES carrier(id)
);

## End point and contracts  ##

Get : localhost:8080/api/v1/parcel/list?limit=1
Get : localhost:8080/api/v1/retailer/list
Post : localhost:8080/api/v1/parcel

 {
 	"externalId": "test1",
 	"createdOn": "2021-06-07 20:32:57",
 	"type": "test type",
 	"status": "status type",
 	"user": {
 		"firstName": "aaa",
 		"lastName": "bbb",
 		"email": "a@a.com"
 	},
 	"agent": {
 		"name": "agent test",
 		"externalId": "agent external id",
 		"address": "agent address"
 	},
 	"retailer": {
 		"name": "amazon"
 	},
 	"carrier": {
 		"name": "DLL"
 	}
 }
