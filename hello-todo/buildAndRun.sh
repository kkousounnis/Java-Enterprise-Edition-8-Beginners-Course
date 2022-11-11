#!/bin/sh
mvn clean package && docker build -t academy.learnprogrammin/hello-javaee8 .
docker rm -f hello-javaee8 || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-javaee8 academy.learnprogrammin/hello-javaee8 
