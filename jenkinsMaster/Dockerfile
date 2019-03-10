# This Dockerfile configures basic slave
FROM jenkins/jenkins:2.150.2
MAINTAINER Raul Pareja <raul.pareja@gmail.com>
USER jenkins
COPY ./groovy-scripts/masterexecutors.groovy /usr/share/jenkins/ref/init.groovy.d/masterexecutors.groovy
