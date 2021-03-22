FROM openjdk:jdk-alpine 
COPY /target/ApiGateway-0.0.1-SNAPSHOT.jar api-gateway.jar 
EXPOSE 8082
ENTRYPOINT ["java","-jar","api-gateway.jar"]