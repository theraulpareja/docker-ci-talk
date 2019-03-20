# This Dockerfile configures basic Jenkins Master
# Based on https://github.com/CodeMazeBlog/docker-series/tree/docker-series-continuous-integration-jenkins-end/jenkins-docker

# Using LTS 2.150
FROM jenkins/jenkins:2.150.2
MAINTAINER Raul Pareja <raul.pareja@gmail.com>

# Setting up environment variables for Jenkins admin user (used by groovy script default-admin.groovy)
ENV JENKINS_USER admin
ENV JENKINS_PASS admin

# Skip the initial setup wizard
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

# Start-up scripts to set number of executors and creating the admin user
COPY ./groovy-scripts/default-admin.groovy /usr/share/jenkins/ref/init.groovy.d/default-admin.groovy
COPY ./groovy-scripts/masterexecutors.groovy /usr/share/jenkins/ref/init.groovy.d/masterexecutors.groovy
