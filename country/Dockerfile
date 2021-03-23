FROM openjdk:jdk-alpine
COPY target/country-0.0.1-SNAPSHOT.jar country-ms.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","country-ms.jar"]