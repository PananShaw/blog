FROM java:8

COPY *.jar /blog.jar

CMD ["--server.port=8081"]

EXPOSE 8081

ENTRYPOINT ["java","-jar","/blog.jar"]