FROM openjdk:8-jdk-alpine
USER root
ADD target/ddf-dataservice-decisions-srv-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx1512m", "-jar", "app.jar" ]
LABEL name="DECISIONS EXTERNAL API"
LABEL version="1.0-SNAPSHOT"
LABEL description="Lumeris Decisions Data API"
