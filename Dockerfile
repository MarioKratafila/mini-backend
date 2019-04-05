FROM openjdk:8-alpine
WORKDIR '/app'
COPY **/*.jar ./start.jar
EXPOSE 8080
CMD ["java","-jar","start.jar"]
