# Manual Deployment

### Setup Project Namespace
```bash
$ oc apply -f namespace.yaml
$ oc apply -f operatorgroup.yaml
```

### Install AMQ Streams and Kafka Cluster
```bash
$ oc apply -f amq-streams/
```

### Install RH Data Grid and Cache
```bash
$ oc create secret generic --from-file=data-grid/identities.yaml connect-secret
$ oc apply -f data-grid/dg-subscription.yaml
$ oc apply -f data-grid/cache.yaml
```

### Install Service Mesh
```bash

```

### Install Grafana and Dashboard
```bash
$ oc apply -f grafana/
```

### Install MySQL and Populate Test Data
```bash

```


