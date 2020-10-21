FROM openjdk:11.0.8
MAINTAINER alefe-dev
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} easy-ticket-0.1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080