FROM ubuntu:latest as build
RUN apt-get update
RUN apt-get installa openjdk-17-jdk -y
COPY .  .
RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=build /build/libs/demo-1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]