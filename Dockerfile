FROM openjdk17:alpine
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
