FROM openjdk:jdk-alpine 
COPY /target/userapp-0.0.1-SNAPSHOT.jar user-app.jar 
EXPOSE 8085
ENTRYPOINT ["java","-jar","user-app.jar"]