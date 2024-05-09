FROM openjdk:17-jdk

LABEL maintainer="jjangkd0@gmail.com"

ARG JAR_FILE=build/libs/todolist-be-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} todolist-be.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","/todolist-be.jar"]