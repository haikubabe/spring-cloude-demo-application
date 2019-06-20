FROM openjdk:8-jdk
MAINTAINER Sreemoyee Chowdhury

COPY target/*.jar /spring-config-server/config-server.jar
VOLUME /config
WORKDIR /
EXPOSE 8888

CMD ["java", "-jar", "spring-config-server/config-server.jar"]