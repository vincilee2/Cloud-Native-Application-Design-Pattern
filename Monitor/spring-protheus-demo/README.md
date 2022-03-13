# Spring prometheus demo

This demo helps you understand how to monitor th tp99 or tp90 latencies of some services.

# Build & Run

To run the application locally, try

```
sh run.sh
```

To build a docker image, first build the project

```
mvn clean package
```

then execute the command:

```
sh docker-build.sh
```

# Deploy to kubernetes

The 
