### Get into your Debian like linux vagrant box
Make sure to use the Vagrantfile with the port forwarding 

vagrant up
vagrant ssh

### Enable docker host remote access
Allow local and remote API access on the host
```
cat /etc/docker/daemon.json
{
  "hosts": [ "unix:///var/run/docker.sock", "tcp://0.0.0.0:2376" ]
}
```

### Make sure your systemd starts using dockerd setup form step above
#### First make sure the next dir exists
```
mkdir -p /etc/systemd/system/docker.service.d/
```

#### Force execution of dockerd (that will use the /etc/docker/daemon.json)
```
cat /etc/systemd/system/docker.service.d/docker.conf
[Service]
ExecStart=
ExecStart=/usr/bin/dockerd
```

