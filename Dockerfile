FROM adoptopenjdk:11-jdk-openj9
ENV PORT 8080
EXPOSE 8080
COPY build/libs/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
