FROM maven:3.9.0-eclipse-temurin-19 AS builder

WORKDIR /app
COPY . .

RUN mvn clean package

FROM maven:3.9.0-eclipse-temurin-19

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
