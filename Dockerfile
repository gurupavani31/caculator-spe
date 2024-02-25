FROM ubuntu:latest

# Install OpenJDK 21 JRE
RUN apt-get update && apt-get install -y openjdk-21-jre-headless

# Copy the JAR file into the container
COPY target/calculator-spe-1.0-SNAPSHOT.jar /app/calculator-spe.jar