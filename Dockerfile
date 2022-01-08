FROM openjdk:8
EXPOSE 8085
ADD target/CodingChallenge1.jar CodingChallenge1.jar
ENTRYPOINT ["java","-jar","/CodingChallenge1.jar"]