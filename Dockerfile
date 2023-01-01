# FROM openjdk:8
FROM openjdk:8-jdk-slim as build
EXPOSE 8080
ADD target/spring-boot-docker1.jar spring-boot-docker2.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker2.jar"]