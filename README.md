# Build Docker image by Maven

This repository contains source code example for build docker images by using a Maven plugin named Jib.

This project contains a very simple Spring-boot code which responses on http://localhost:8080

## How to run

The only thing that we must do is adding and configuring Jib Maven plugin In pom.xml file in our project. So this file would be a proper point to make your hand wet:

This pom.xml is self-descriptive as well, and you can focus on its content for learning the concept but please take into these conciderations:

* Replace your Docker hub credentials at line 4, 5, 6
* <from> tag determines the base image which our final Docker image would be built from it
* <to> tag is mandatory and determines name of our targeted Docker image
* in <execution> part determined that running "mvn package" command will run also "mvn jib:build" goal. And so we now do have building our desired Docker image in our packaging workflow as an automatic operation.


<br>
Thanks for reading<br>
Amir Keshavarz
