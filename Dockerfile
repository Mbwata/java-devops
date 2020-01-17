#
# Build stage
#
FROM maven:3.6.1-jdk-7 AS build
COPY springmvcexample/src /home/app/src
COPY springmvcexample/pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

#
# Package stage
#
FROM housems\mattcat

COPY --from=build /home/app/target/springmvcexample.war /usr/local/tomcat/webapps/