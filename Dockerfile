FROM openjdk:11-slim
WORKDIR /app
COPY target/sprecsample-0.0.1-SNAPSHOT.jar /app
ENV SERVER_PORT 5000
EXPOSE $SERVER_PORT
CMD ["java", "-jar", "sprecsample-0.0.1-SNAPSHOT.jar" ]