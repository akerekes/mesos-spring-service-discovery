FROM develar/java

ADD https://s3-us-west-2.amazonaws.com/akerekes-dcos-jar-repo/service-discovery-demo-0.0.1-SNAPSHOT.jar /service-discovery-demo-0.0.1-SNAPSHOT.jar
WORKDIR /
EXPOSE 8080
CMD ["-jar", "/service-discovery-demo-0.0.1-SNAPSHOT.jar", "--spring.config.name=randomnumber-application"]
