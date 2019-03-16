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
Docker can help us with that, it encapsualtes your applications with all the needed dependencies into containers.

EXPLAIN CONTAINERS HERE:

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

#### Persistent data
Use Volumes for:

* Data persistence
* Optimize writing files 