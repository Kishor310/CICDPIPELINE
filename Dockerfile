FROM amazoncorretto:17-alpine
EXPOSE 8080
ADD target/*.jar springboot-images-new.jar
ENTRYPOINT ["java", "-jar", "springboot-images-new.jar"]