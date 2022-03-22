FROM openjdk:11
EXPOSE 9002
ADD build/libs/student-service-0.0.1-SNAPSHOT.jar student-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/student-service-0.0.1-SNAPSHOT.jar"]