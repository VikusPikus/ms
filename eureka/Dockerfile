FROM openjdk:jdk-alpine
COPY target/eureka-0.0.1-SNAPSHOT.jar eureka-ms.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-ms.jar"]