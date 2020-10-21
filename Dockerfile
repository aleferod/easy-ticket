FROM openjdk:11.0.8-jre-slim-stretch
MAINTAINER alefe-dev
ADD easy-ticket-0.1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080