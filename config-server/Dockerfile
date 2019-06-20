FROM openjdk:8-jdk
MAINTAINER Sreemoyee Chowdhury

ARG CONFIG_SERVER_JAR

ENV SPRING_CLOUD_CONFIG_SERVER_GIT_URI=/spring-cloud/config
COPY target/$CONFIG_SERVER_JAR /spring-cloud/config-server.jar
VOLUME /spring-cloud/config
EXPOSE 8888

CMD ["java", "-jar", "/spring-cloud/config-server.jar"]