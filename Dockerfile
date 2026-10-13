# Use the offical OpenJDK  27 image from docker hub
FROM opendjdk:27
#Set working directory inside container
WORKDIR /app
#Copy the compiled application jar file into the aws container
COPY ./target/demo-ecs-cicd-0.0.1-SNAPSHOT.jar /app
#Expose the port the spring boot applicaton will run on
EXPOSE 8080
#Command to run the application
CMD ["java","-jar","demo-ecs-cicd-0.0.1-SNAPSHOT.jar"]
