FROM openjdk:11-jre-slim
COPY target/streaming-0.0.1-SNAPSHOT.jar /app/comment-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app/comment-service.jar"]
