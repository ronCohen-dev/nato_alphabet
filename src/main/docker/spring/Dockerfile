FROM eclipse-temurin:latest
EXPOSE 8000
ENV APP_HOME=/var/www
WORKDIR $APP_HOME

COPY ./.mvn ./.mvn
COPY ./mvnw ./
COPY ./pom.xml ./
RUN ./mvnw clean -f pom.xml
COPY ./src ./src
RUN ./mvnw package -f pom.xml

CMD ["java", "-jar", "./target/nato_alphabet.jar"]
