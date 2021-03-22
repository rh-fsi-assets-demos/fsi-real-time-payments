#!/usr/bin/env bash

# --- Create OpenShift project

# --- Install AMQ Streams

# --- Install MySQL

# --- Build maven projects
for project in \
    domain-model \
    message-model \
    payments-repository \
    debtor-payments-service \
    debtor-format-validation \
    debtor-aml-check \
    debtor-fraud-check \
    debtor-core-banking \
    debtor-message-generation \
    debtor-send-payment \
    mock-rtp-network \
    debtor-payments-confirmation \
    debtor-payments-lifecycle \
    creditor-incoming-payments \
    creditor-payment-validation \
    creditor-aml-check \
    creditor-payment-acknowledgement \
    creditor-payments-confirmation
do
    printf "Building $project\n"
    cd $project
    mvn clean install
    cd ..
done

# --- Import Java 8
oc import-image java8 --from=registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift -n openshift --confirm

# --- Build and deploy project images
cd debtor-payments-service
oc new-build java8 --name=debtor-payment-service --binary=true -n rtp-demo
oc start-build debtor-payment-service --from-file=target/debtor-payments-service-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-payment-service-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-payment-service -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e PRODUCER_TOPIC=debtor-incoming-payments \
-e SECURITY_PROTOCOL=PLAINTEXT \
-e SERIALIZER_CLASS=rtp.demo.domain.payment.serde.PaymentSerializer \
-e ACKS=1 \
-e DATABASE_URL="jdbc:mysql://mysql-56-rhel7:3306/rtpdb?autoReconnect=true" \
-e DATABASE_USER=dbuser \
-e DATABASE_PASS=dbpass

oc expose svc/debtor-payment-service

cd ../debtor-format-validation
oc new-build java8 --name=debtor-format-validation --binary=true -n rtp-demo
oc start-build debtor-format-validation --from-file=target/debtor-format-validation-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-format-validation-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-format-validation -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=debtor-incoming-payments \
-e PRODUCER_TOPIC=debtor-format-validation-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-format-validation


cd ../debtor-aml-check
oc new-build java8 --name=debtor-aml-check --binary=true -n rtp-demo
oc start-build debtor-aml-check --from-file=target/debtor-aml-check-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-aml-check-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-aml-check -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=debtor-format-validation-output \
-e PRODUCER_TOPIC=debtor-aml-check-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-aml-check


cd ../debtor-fraud-check
oc new-build java8 --name=debtor-fraud-check --binary=true -n rtp-demo
oc start-build debtor-fraud-check --from-file=target/debtor-fraud-check-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-fraud-check-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-fraud-check -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=debtor-format-validation-output \
-e PRODUCER_TOPIC=debtor-fraud-check-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-fraud-check


cd ../debtor-core-banking
oc new-build java8 --name=debtor-core-banking --binary=true -n rtp-demo
oc start-build debtor-core-banking --from-file=target/debtor-core-banking-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-core-banking-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-core-banking -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=debtor-fraud-check-output \
-e CONSUMER_TOPIC_2=debtor-aml-check-output \
-e PRODUCER_TOPIC=debtor-core-banking-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-core-banking


cd ../debtor-send-payment
oc new-build java8 --name=debtor-send-payment --binary=true -n rtp-demo
oc start-build debtor-send-payment --from-file=target/debtor-send-payment-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-send-payment-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-send-payment -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=debtor-core-banking-output \
-e PRODUCER_TOPIC=mock-rtp-incoming \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-send-payment


cd ../mock-rtp-network
oc new-build java8 --name=mock-rtp-network --binary=true -n rtp-demo
oc start-build mock-rtp-network --from-file=target/mock-rtp-network-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep mock-rtp-network-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app mock-rtp-network -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=mock-rtp-incoming \
-e PRODUCER_TOPIC=mock-rtp-debtor-confirmation \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=mock-rtp-network


cd ../debtor-payments-confirmation
oc new-build java8 --name=debtor-payments-confirmation --binary=true -n rtp-demo
oc start-build debtor-payments-confirmation --from-file=target/debtor-payments-confirmation-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-payments-confirmation-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-payments-confirmation -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=mock-rtp-debtor-confirmation \
-e PRODUCER_TOPIC=debtor-payments-confirmation-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-payments-confirmation


cd ../debtor-payments-lifecycle
oc new-build java8 --name=debtor-payments-lifecycle --binary=true -n rtp-demo
oc start-build debtor-payments-lifecycle --from-file=target/debtor-payments-lifecycle-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep debtor-payments-lifecycle-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app debtor-payments-lifecycle -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=debtor-payments-lifecycle \
-e DATABASE_URL="jdbc:mysql://mysql-56-rhel7:3306/rtpdb?autoReconnect=true" \
-e DATABASE_USER=dbuser \
-e DATABASE_PASS=dbpass


cd ../creditor-incoming-payments
oc new-build java8 --name=creditor-incoming-payments --binary=true -n rtp-demo
oc start-build creditor-incoming-payments --from-file=target/creditor-incoming-payments-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep creditor-incoming-payments-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app creditor-incoming-payments -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=mock-rtp-creditor-incoming \
-e PRODUCER_TOPIC=creditor-incoming-payments \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=creditor-incoming-payments


cd ../creditor-payment-validation
oc new-build java8 --name=creditor-payment-validation --binary=true -n rtp-demo
oc start-build creditor-payment-validation --from-file=target/creditor-payment-validation-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep creditor-payment-validation-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app creditor-payment-validation -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=creditor-incoming-payments \
-e PRODUCER_TOPIC=creditor-payment-validation-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=creditor-payment-validation


cd ../creditor-aml-check
oc new-build java8 --name=creditor-aml-check --binary=true -n rtp-demo
oc start-build creditor-aml-check --from-file=target/creditor-aml-check-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep creditor-aml-check-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app creditor-aml-check -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=creditor-payment-validation-output \
-e PRODUCER_TOPIC=creditor-aml-check-output \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=creditor-aml-check


cd ../creditor-payment-acknowledgement
oc new-build java8 --name=creditor-payment-acknowledgement --binary=true -n rtp-demo
oc start-build creditor-payment-acknowledgement --from-file=target/creditor-payment-acknowledgement-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep creditor-payment-acknowledgement-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app creditor-payment-acknowledgement -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=creditor-aml-check-output \
-e PRODUCER_TOPIC=mock-rtp-creditor-acknowledgement \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=creditor-payment-acknowledgement


cd ../creditor-payments-confirmation
oc new-build java8 --name=creditor-payments-confirmation --binary=true -n rtp-demo
oc start-build creditor-payments-confirmation --from-file=target/creditor-payments-confirmation-1.0.0.jar -n rtp-demo
until [ "$(oc get pods | grep creditor-payments-confirmation-* | grep Completed 2> /dev/null)" ]; do sleep 3; printf "Waiting until build completes...\n"; done
oc new-app creditor-payments-confirmation -n rtp-demo \
-e BOOTSTRAP_SERVERS="rtp-demo-cluster-kafka-bootstrap:9092" \
-e CONSUMER_TOPIC=mock-rtp-creditor-confirmation \
-e PRODUCER_TOPIC=mock-rtp-incoming \
-e CONSUMER_MAX_POLL_RECORDS=500 \
-e CONSUMER_COUNT=1 \
-e CONSUMER_SEEK_TO=end \
-e CONSUMER_GROUP=creditor-payments-confirmation
