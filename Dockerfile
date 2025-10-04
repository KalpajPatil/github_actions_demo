FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file from your build to the container
COPY target/*.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
