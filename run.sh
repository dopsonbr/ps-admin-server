#!/bin/sh

java -agentlib:jdwp=transport=dt_socket,address=5006,server=y,suspend=n \
	-Djava.security.egd=file:/dev/./urandom \
	-Dspring.cloud.config.uri=$CONFIG_SERVER_URI \
	-jar /work/*.jar 
