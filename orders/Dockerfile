FROM adoptopenjdk/openjdk11:ubi
ADD target/orders-0.0.1-SNAPSHOT.jar orders.jar
EXPOSE 8040
ENTRYPOINT ["java","-jar","/orders.jar","orders"]
