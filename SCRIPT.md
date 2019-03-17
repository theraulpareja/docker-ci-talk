# CI with containers

## Goals

Benefits of adopting docker for CI
User docker for the right services
A mindset change for systems administration
Embrace the best practices
    Don't trust images by default
    Persisting data with docker volumes (avoid bind volumes)
    Trty to avoid databses into containers
    Isolate netwroks
    COPY vs ADD
    ENTRYPOINT vs CMD
Security 
Docker host maintenance needed
Kubernetes for infra maintenance abstraction

### Benefits of docker for CI
Docs and references
https://www.thoughtworks.com/continuous-integration

Continuous Integration (CI) is a development practice that requires developers to integrate code into a shared repository several times a day. Each check-in is then verified by an automated build, allowing teams to detect problems early.

Advantages .... is cheap ... reduce times for troubleshooting
Best practices ... run on every commit, be fast, unit tests + integration tests

Common issues... diferences between a developer workstation environment vs CI environment setups, dependencies on infra teams to update tools ...

Whould be very nice to share among the team meambers and the CI system a common portable environmet that ensures that all the needed versions, dependencies and tools are exactly the seam for each member, and that environment is also used for the CI integration tests.

### Docker for portable apps
Docs and references
https://opensource.com/resources/what-docker
https://www.codementor.io/blog/docker-technology-5x1kilcbow
http://collabnix.com/how-docker-for-mac-works-under-the-hood/


Docker can help us with that, it encapsualtes your applications with all the needed dependencies (binaries and libs) into containers.

EXPLAIN CONTAINERS HERE:
Docker is a tool designed to make it easier to create, deploy, and run applications by using containers. Containers allow a developer to package up an application with all of the parts it needs, such as libraries and other dependencies, and ship it all out as one package. By doing so, thanks to the container, the developer can rest assured that the application will run on any other Linux machine regardless of any customized settings that machine might have that could differ from the machine used for writing and testing the code.

Docker only runs on Linux. For instance, if you develop on an Apple computer (which uses a Darwin/BSD Kernel), you’ll need to install a lightweight Linux virtual machine before being able to use Docker.

Docker is made of two main components:

Client: Docker Engine - Community
 Version:           18.09.2
 API version:       1.39
 Go version:        go1.10.8
 Git commit:        6247962
 Built:             Sun Feb 10 04:12:39 2019
 OS/Arch:           darwin/amd64
 Experimental:      false

Server: Docker Engine - Community
 Engine:
  Version:          18.09.2
  API version:      1.39 (minimum version 1.12)
  Go version:       go1.10.6
  Git commit:       6247962
  Built:            Sun Feb 10 04:13:06 2019
  OS/Arch:          linux/a

A client that runs the commands and is needed to build images from Dockerfiles 
A Linux server which runs the docker daemon or a cluster (Swarm and Kubernetes)

DOCKER ECOSYSTEM

BUILD(the docker image) - SHIP(save it in some registry and scan for vulns etc) + RUN(deployed container in QA or PROD)

#### Persistent data
Use Volumes for:

* Data persistence
* Optimize writing files 

### CI with docker
Docs and references
https://www.youtube.com/watch?v=gHlRpZJ768U

For a develper perspective is just a push

### Docker host maintenance
Docs and references:
https://askubuntu.com/questions/159491/why-did-the-command-make-my-system-lag-so-badly-i-had-to-reboot