FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar","-DDB_HOST=mysql-ctr"]