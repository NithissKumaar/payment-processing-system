# Step 1: Build stage using Maven and Java 17
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run stage using a lightweight Java 17 image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# FIXED LINE: Uses wildcard to find the jar regardless of naming convention
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]