# Step 1: Build stage using Maven and Java 17
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run stage using a lightweight Java 17 image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Note: Ensure your pom.xml generates a jar. If it's named differently, 
# you can use: COPY --from=build /app/target/*.jar app.jar
COPY --from=build /app/target/payment-system-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]