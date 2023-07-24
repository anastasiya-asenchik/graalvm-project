FROM vegardit/graalvm-maven:latest-java17 as builder

WORKDIR /app

COPY pom.xml /app/
COPY src /app/src/

RUN mvn -Pnative native:compile -DskipTests

FROM mirekphd/jenkins-jdk17-on-ubuntu2204:latest

COPY --from=builder /app/target/graalvm-project /app/

CMD ["/app/graalvm-project"]
