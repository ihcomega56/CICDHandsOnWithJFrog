FROM adoptopenjdk/openjdk11:alpine
RUN mkdir work
RUN addgroup -S spring && adduser -S spring spring
USER spring:spring
COPY build/libs/*.jar work/app.jar
ENTRYPOINT ["java","-jar","/work/app.jar"]