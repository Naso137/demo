FROM maven:3.9.0-eclipse-temurin-19 AS builder

WORKDIR /app
COPY . .

RUN mvn clean package

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar demo.jar

CMD ["java", "-jar", "demo.jar"]
