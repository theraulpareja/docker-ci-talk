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
