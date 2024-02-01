FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.18_10


ADD target/order-service.jar order-service.jar
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "/order-service.jar"]