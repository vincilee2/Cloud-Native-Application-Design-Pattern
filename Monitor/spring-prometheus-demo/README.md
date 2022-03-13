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

deploy the container

```
kubectl apply -f deploy/deployment.yaml
```

deploy the configmap of prometheus, see [Configure scraping of Prometheus metrics with Container insights](https://docs.microsoft.com/en-us/azure/azure-monitor/containers/container-insights-prometheus-integration)

```
kubectl apply -f deploy/prometheus_configmap.yaml
```
