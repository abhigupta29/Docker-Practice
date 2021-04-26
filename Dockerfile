FROM openjdk

COPY ./rest-service/target/rest-service-0.0.1-SNAPSHOT.jar .
COPY ./docker-application.properties .

CMD ["java","-jar","rest-service-0.0.1-SNAPSHOT.jar","--spring.config.location=file:///./docker-application.properties"]