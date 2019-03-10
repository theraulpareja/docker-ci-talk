# docker-ci-talk

### Description

This repo just contains very basic infra docker based to have a minimal lab for a CI Docker demo 

It will spin up in total 4 docker containers and creates a volume and an internal network (bridge based to be run on a single docker host) 

* Jenkins master 2.150.2 LTS
* slave1 Ubuntu 18.04 LTS 
* slave2 Ubuntu 18.04 LTS
* slave3 Ubuntu 18.04 LTS

### Requirements

* Docker version 18.09.2 or above
* docker-compose version 1.23.2 or above

Please notice that exposure of port 50000 is only needed in case you need JNLP, in case you want to add a windows node as slave via JNLP.

### How to build and run the containers + basic config of jenkins

Run it with docker-compose in detached mode forcing build at least the very first time
```
COMPOSE_HTTP_TIMEOUT=200 docker-compose up -d --build
```

The very first time you will need to provide the "initialAdminPassword" from /var/jenkins_home/secrets/initialAdminPassword

Is recommended to just install the suggested plugins

### How to stop and remove the cotnainers
```
docker-compose down
```

### How to add the slave nodes into the jenkins master

While not being automated yet, pelase notice the steps needed to add the 3 ubuntu slaves created by the docker-compose to the jenkins master once initially configured:

* As an admin user, go to the url localhost:8080/computer, select 'New Node'
* Provide a node name, e.g. linux-slave1 and select 'permanent agent'
* Fill the data requested, name, description, executors until you rech launch method
* Select Launch method to 'Launch slave agent via SSH'
* Provide the ip in the host field acording to the ips of the docker-compose.yaml file, the original ones are 192.168.250.3 for unbut_salve1, 192.168.250.4 for unbut_salve2 and 192.168.250.5 for unbut_salve3
* You will need to create the jenkins credentials by clicking Add -> Jenkins -> ensure Kind Userame with password and fill Username with jenkins and Password with jenkins and finally Add
* IMPORTANT, select Host Key Verification Strategy to 'Non verifying Verfication Strategy'  you will need to add(create) credentials the first time with user jenkins and password jenkins,
