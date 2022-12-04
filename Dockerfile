FROM adoptopenjdk/openjdk17:debian-slim
RUN apt-get update -y
RUN apt-get install --no-install-recommends --assume-yes wget
RUN mkdir app
RUN ["chmod", "+rwx", "/app"]
WORKDIR /app
COPY --chown=0:0 target/registration-login-demo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8094
CMD java -jar registration-login-demo-0.0.1-SNAPSHOT.jar
