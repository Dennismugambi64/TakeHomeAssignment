FROM amazoncorretto:17
WORKDIR /app
COPY target/dennis-muriuki-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar"]