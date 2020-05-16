FROM adoptopenjdk/openjdk11:ubi
ADD target/aggregator-0.0.1-SNAPSHOT.jar aggregator.jar
EXPOSE 8060
ENTRYPOINT ["java","-jar","/aggregator.jar","aggregator"]
