# FROM openjdk:8
FROM openjdk:15
EXPOSE 8080
ADD target/spring-boot-docker1.jar spring-boot-docker2.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker2.jar"]
