FROM adoptopenjdk:8-jdk
WORKDIR /app
COPY build/libs/kafka-msg-consumer-app-1.0-SNAPSHOT.war kafka-msg-consumer-app-1.0-SNAPSHOT.war
EXPOSE 8066
CMD ["java","-jar","kafka-msg-consumer-app-1.0-SNAPSHOT.war"]