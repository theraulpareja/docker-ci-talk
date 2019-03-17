# DEMO lab

## Containers 
The next containers are created with with docker-compose.yaml of the repo:
https://github.com/theraulpareja/docker-ci-talk.git

### Jenkins master
localhost:8080 on the docker host eachable within the docker network cinet with ip 192.168.250.2

### Ubuntu nodes 
ubuntu_slave1 reachable within the docker network cinet with ip 192.168.250.3
ubuntu_slave2 reachable within the docker network cinet with ip 192.168.250.4
ubuntu_slave3 reachable within the docker network cinet with ip 192.168.250.5

## Vagrant boxes
The vagrant boxes have been created to emulate:

### Docker host
cd ~/VagrantBoxes/Debian9
vagrant up
vagrant ssh 

#### To access the GIT repo
Inside the vagrant box Debian9
cd GIT

CONSIDER ARTIFACTORY instances

### Build andorid apps with docker
Docs and references
https://medium.com/@tonespy/using-jenkins-pipeline-and-docker-for-android-continuous-integration-5fd39f8957a7
https://medium.com/@AndreSand/building-android-with-docker-8dbf717f54d4 (andorid sdk docker image)
https://medium.com/@AndreSand/android-emulator-on-docker-container-f20c49b129ef (docker andorid emulator)

How to create andorid app
https://developer.android.com/training/basics/firstapp

### Andorid studio setup
What has been installed into my andorid studio installation 

Setup Type: Standard
SDK Folder: /Users/mishkin/Library/Android/sdk
Total Download Size: 991 MB
SDK Components to Download: 
Android Emulator
  
168 MB
Android SDK Build-Tools 28.0.3
  
54.5 MB
Android SDK Platform 28
  
72.1 MB
Android SDK Platform-Tools
  
11.2 MB
Android SDK Tools
  
98.2 MB
Android Support Repository
  
339 MB
Google Repository
  
205 MB
Intel x86 Emulator Accelerator (HAXM installer)
  
220 KB
SDK Patch Applier v4
  
1.74 MB
Sources for Android 28
  
40.6 MB

