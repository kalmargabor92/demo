#docker build -t gkalmardocker/demo:latest . --no-cache
#Rebuild the project and image
FROM maven:openjdk AS build
COPY ./src /home/app/src
COPY ./pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:17
COPY --from=build /home/app/target/*.jar /usr/local/lib/demo.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/demo.jar"]
