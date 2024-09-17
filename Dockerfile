FROM openjdk:17
ADD target/azcosmos-movie-app.jar azcosmos-movie-app.jar
ENTRYPOINT ["java", "-jar" , "azcosmos-movie-app.jar"]