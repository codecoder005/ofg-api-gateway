FROM openjdk:11
ADD target/ofg-api-gateway-1.0.0.jar ofg-api-gateway-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ofg-api-gateway-1.0.0.jar"]
