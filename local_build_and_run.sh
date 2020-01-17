#!/bin/sh

docker build -t cattest:latest .
docker run -d --rm -p 8888:8080 cattest
open -a safari http://localhost:8888/springmvcexample/employee-module/addNew
