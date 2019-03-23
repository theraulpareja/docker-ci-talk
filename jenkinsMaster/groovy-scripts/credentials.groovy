import jenkins.model.*
import com.cloudbees.plugins.credentials.*
import com.cloudbees.plugins.credentials.impl.*;
import com.cloudbees.plugins.credentials.common.*
import com.cloudbees.plugins.credentials.domains.*
import com.cloudbees.jenkins.plugins.sshcredentials.impl.*
import org.jenkinsci.plugins.plaincredentials.impl.*

//Functions
def createSSHCredential(id, username, sshkeyName, description) {
  return new BasicSSHUserPrivateKey(CredentialsScope.GLOBAL,
          id, username,
          new BasicSSHUserPrivateKey.FileOnMasterPrivateKeySource('/var/lib/jenkins_home/.ssh/'+sshkeyName),
          '', description)
}

def addCredential(credential) {
  if (!com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
      credential.class, Jenkins.instance, null, null).find { it.id == credential.getId() }) {
    println "INFO: Creating Credential ID '${credential.getId()}' with description '${credential.getDescription()}' ..."
    SystemCredentialsProvider.getInstance().getStore().addCredentials(Domain.global(), credential)
  }
  else {
    println "Credential with ID '${credential.getId()}' already exists!"
    return false
  }
  return true
}

//Vars
id = 'slaves-ssh-key'
username = 'jenkins'
sshkeyName = 'jenkins_id_rsa'
description = 'SSH key to connect to slaves'

credential = createSSHCredential(id, username, sshkeyName, description)
addCredential(credential)

