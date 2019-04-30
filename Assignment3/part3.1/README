# Web Services and Cloud-Based Systems - Assignment 3.1

Contextualize a Docker container to deploy the URL Shortner Web	service	
(developed for	Assignment	1.1). The service should be	available (visible) from	
other containers first on the same host	or from	remote host. To	enable remote	
containers to communicate use the p2p vpn (zerotier) system3 .

**a.** Test	available bandwidth between	docker containers using iperf.

**b.** Test broadcasting messages between docker containers	using socat,	
netcat

**c.** Deploy URL Shortner Web	service	(developed for Assignment 1.1)

## Getting Started

These instructions will get you a copy of the solution up and running on your local machine for development and testing purposes. 

### Prerequisites

Before running the service and creating the VM, you must have access to the following system and install 
requirements:

Access with Docker installed **DAS-4**


**Python3.xx**

### Setup, deploy VM & access VM

There is already a Dockerfile defined. Build the image from the Dockerfile. For example:

```
docker build --tag=url-shortener .
```

Now you can run the URL Shortener service and create a URL container by specifying the --name option:
```
docker run -p 4000:80 --name URL url-shortener
```

Go to that URL in a web browser to see the display content served up on a web page.
```
http://localhost:4000
```

You can view docker images
```
docker images
```

You can check for containers:
```
docker ps
```

In order to access your docker container via SSH, first, start the container:
```
docker container start URL
```

SSH inside container:
```
docker exec -it URL /bin/bash
```
