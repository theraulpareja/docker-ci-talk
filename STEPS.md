1- First start the vagrant box with docker installed  and open an ssh session

2- Start docker app on your mac OSX to have the jenkins instance up 
```
cd GIT/docker-ci-talk
docker-compose up -d --build
```
3- Check the docker-host is reachable with
```  
docker -H='127.0.0.1:9999' image ls
```
3- Make sure to have
vagrant/vagrant credentials

4- Add the next pipelines and views

