# Start from an OpenJDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Create a directory for the app
WORKDIR /app

# Copy the built jar into the container
COPY target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]