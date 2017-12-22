FROM openjdk:8-jdk-alpine
USER root

RUN mkdir /security
COPY security/keystore.jks /security/keystore.jks
COPY security/truststore.jks /security/truststore.jks
ADD target/ddf-dataservice-decisions-srv-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx1512m", "-jar" , "-Djavax.net.ssl.trustStore=/security/truststore.jks","-Djavax.net.ssl.trustStorePassword=ldp-services-truststore-secret", "app.jar" ]
LABEL name="DECISIONS EXTERNAL API"
LABEL version="1.0-SNAPSHOT"
LABEL description="Lumeris Decisions Data API"
