FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
