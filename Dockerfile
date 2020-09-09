FROM openjdk:8-jre
VOLUME /tmp
WORKDIR /data
COPY target/spring-arguments-commands-example-0.0.1-SNAPSHOT.jar  /data
EXPOSE 8080
ENTRYPOINT ["java" ,"-jar", "spring-arguments-commands-example-0.0.1-SNAPSHOT.jar"]
CMD 10