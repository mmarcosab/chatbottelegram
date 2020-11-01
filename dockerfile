FROM openjdk:11
COPY ./target/chatbottelegram-0.0.1-SNAPSHOT.jar /usr/app/chat/chatbottelegram-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/usr/app/chat/chatbottelegram-0.0.1-SNAPSHOT.jar" ]