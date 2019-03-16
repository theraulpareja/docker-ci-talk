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

# Installing the plugins we need using the in-built install-plugins.sh script
RUN /usr/local/bin/install-plugins.sh cloudbees-folder jdk-tool script-security command-launcher structs workflow-step-api bouncycastle-api scm-api workflow-api junit antisamy-markup-formatter token-macro build-timeout credentials ssh-credentials plain-credentials credentials-binding timestamper workflow-support durable-task workflow-durable-task-step matrix-project resource-disposer ws-cleanup ant gradle pipeline-milestone-step jquery-detached jackson2-api ace-editor workflow-scm-step workflow-cps pipeline-input-step pipeline-stage-step workflow-job pipeline-graph-analysis pipeline-rest-api handlebars momentjs pipeline-stage-view pipeline-build-step pipeline-model-api pipeline-model-extensions apache-httpcomponents-client-4-api jsch git-client git-server workflow-cps-global-lib display-url-api mailer branch-api workflow-multibranch authentication-tokens docker-commons workflow-basic-steps docker-workflow pipeline-stage-tags-metadata pipeline-model-declarative-agent pipeline-model-definition lockable-resources workflow-aggregator github-api git github github-branch-source pipeline-github-lib mapdb-api subversion ssh-slaves matrix-auth pam-auth ldap email-ext

# Start-up scripts to set number of executors and creating the admin user
COPY ./groovy-scripts/default-admin.groovy /usr/share/jenkins/ref/init.groovy.d/default-admin.groovy
COPY ./groovy-scripts/masterexecutors.groovy /usr/share/jenkins/ref/init.groovy.d/masterexecutors.groovy
