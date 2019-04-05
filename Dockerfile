FROM openjdk:8-alpine
WORKDIR '/app'
COPY **/*.jar ./start.jar
CMD ["java","-jar","start.jar"]
