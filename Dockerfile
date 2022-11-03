FROM openjdk:8
EXPOSE 8080
ADD target/spring-ci.jar spring-ci.jar
ENTRYPOINT ["java","-jar","/spring-ci.jar"]