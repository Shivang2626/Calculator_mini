FROM openjdk
COPY ./target/Calculator_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar"]