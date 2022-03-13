FROM alpine:latest

ENV JAVA_HOME="/usr/lib/jvm/default-jvm/"
RUN apk add openjdk11

# Has to be set explictly to find binaries 
ENV PATH=$PATH:${JAVA_HOME}/bin

RUN mkdir export
COPY target/spring-prometheus-demo-0.0.1-SNAPSHOT.zip /export
RUN apk update && apk add curl
RUN cd /export && unzip spring-prometheus-demo-0.0.1-SNAPSHOT.zip
RUN rm /export/spring-prometheus-demo-0.0.1-SNAPSHOT.zip
WORKDIR /export/spring-prometheus-demo-0.0.1-SNAPSHOT

ENTRYPOINT ["java","-jar", "spring-prometheus-demo-0.0.1-SNAPSHOT.jar"]