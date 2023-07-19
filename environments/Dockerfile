# Use a base image with Maven and OpenJDK 17
FROM vegardit/graalvm-maven:latest-java17 as builder

# Set the working directory
WORKDIR /app

# Copy your application source code and pom.xml
COPY pom.xml /app/
COPY src /app/src/

# Build your application with Maven
RUN mvn -Pnative native:compile
#RUN native-image --no-server -cp target/graalvm-project-0.0.1-SNAPSHOT.jar

# Use a minimal base image for running the native image
FROM mirekphd/jenkins-jdk17-on-ubuntu2204:latest

# Copy the native image from the previous stage
COPY --from=builder /app/target/graalvm-project /app/

# Set the entry point for the native image
CMD ["/app/graalvm-project"]
