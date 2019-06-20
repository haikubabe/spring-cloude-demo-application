FROM openjdk:8-jdk
MAINTAINER Sreemoyee Chowdhury

COPY target/*.jar /spring-config-client/config-client.jar
WORKDIR /
EXPOSE 8080

CMD ["java", "-jar", "spring-config-client/config-client.jar"]