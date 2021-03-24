#Dockerfile for ApiGatewayService
FROM openjdk:11
EXPOSE  9000
COPY ./target/ApiGatewayService-0.0.1-SNAPSHOT.jar ApiGatewayService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ApiGatewayService-0.0.1-SNAPSHOT.jar"]