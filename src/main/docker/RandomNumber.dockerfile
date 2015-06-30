FROM java:8
COPY ../../../target/service-discovery-demo-0.0.1-SNAPSHOT.jar /service-discovery-demo-0.0.1-SNAPSHOT.jar
WORKDIR /
CMD ["java", "-cp", "service-discovery-demo-0.0.1-SNAPSHOT.jar", "demo.RandomNumberApplication"]