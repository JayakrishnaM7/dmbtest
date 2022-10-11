FROM adoptopenjdk/openjdk8-openj9


USER root



ADD ./target/*.jar /opt/paymentinitiation-1.0.0.jar

CMD ["java", "-Xmx200m", "-jar", "/opt/paymentinitiation-1.0.0.jar"]

EXPOSE 8080

