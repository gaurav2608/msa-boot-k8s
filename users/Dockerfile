FROM adoptopenjdk/openjdk11:ubi
ADD target/users-0.0.1-SNAPSHOT.jar users.jar
EXPOSE 8050
ENTRYPOINT ["java","-jar","/users.jar","users"]
