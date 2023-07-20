# GraalVm test project

This is the simple test project to create GraalVm native image using Spring Boot 3+, Maven as a build tool, and containerize native image in Docker

## Getting started

Versions: Java 17, GraalVm 23.0, Spring Boot 3.0.8

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
 mvn -Pnative spring-boot:build-image
```

Then, you can run the app like any other container:

```
 docker run --rm -p 8080:8080 graalvm-project:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, simply open the terminal in the root of the project and run the following command:

```
 docker-compose up -d
```

This project contains [Dockerfile](environments/Dockerfile) and [docker-compose](environments/docker-compose.yml) file, where all the configuration is set-upped.

As we can build a native executable directly with Maven using the `mvn -Pnative native:compile` command, we don't need to run the `native-image` command as a separate step.

For additional information look [here](HELP.md).