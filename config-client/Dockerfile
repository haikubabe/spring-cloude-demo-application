FROM openjdk:8-jdk
MAINTAINER Sreemoyee Chowdhury

ARG CONFIG_CLIENT_JAR
COPY target/$CONFIG_CLIENT_JAR /spring-cloud/config-client.jar
ENV SPRING_PROFILES_ACTIVE
EXPOSE 8080

CMD ["java", "-jar", "/spring-cloud/config-client.jar"]