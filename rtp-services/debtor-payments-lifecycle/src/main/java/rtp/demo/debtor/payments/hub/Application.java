/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package rtp.demo.debtor.payments.hub;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * A spring-boot application that includes a Camel route builder to setup the
 * Camel routes
 */
@SpringBootApplication
@EnableJpaRepositories("rtp.demo.payment.repository")
@ComponentScan(basePackages = { "rtp.demo.payment.repository", "rtp.demo.domain.payment", "rtp.demo.domain.account",
		"rtp.demo.debtor.payment", "io.swagger", "rtp.demo.domain", "io.swagger.configuration",
		"rtp.demo.debtor.payments.hub" })
@EntityScan(basePackages = { "rtp.demo.domain.payment", "rtp.demo.domain.account" })
@ImportResource({ "classpath:spring/camel-context.xml" })
public class Application extends RouteBuilder {

	private String kafkaBootstrap = System.getenv("BOOTSTRAP_SERVERS");
	private String consumerMaxPollRecords = System.getenv("CONSUMER_MAX_POLL_RECORDS");
	private String consumerCount = System.getenv("CONSUMER_COUNT");
	private String consumerSeekTo = System.getenv("CONSUMER_SEEK_TO");
	private String consumerGroup = System.getenv("CONSUMER_GROUP");

	// must have a main method spring-boot can run
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void configure() throws Exception {

		KafkaComponent kafka = new KafkaComponent();
		kafka.setBrokers(kafkaBootstrap);
		this.getContext().addComponent("kafka", kafka);

		from("kafka:" + "debtor-format-validation-output" + "?brokers=" + kafkaBootstrap + "&maxPollRecords="
				+ consumerMaxPollRecords + "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo
				+ "&groupId=" + consumerGroup + "&valueDeserializer="
				+ rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName())
						.routeId("FromKafkaFormatValidation").log("\n/// Debtor Payments Lifecycle >>> ${body}")
						.bean(PaymentsLifecycleBean.class, "addStatusFormatValidation")
						.to("kafka:" + "debtor-payment-audit" + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

		from("kafka:" + "debtor-fraud-check-output" + "?brokers=" + kafkaBootstrap + "&maxPollRecords="
				+ consumerMaxPollRecords + "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo
				+ "&groupId=" + consumerGroup + "&valueDeserializer="
				+ rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName()).routeId("FromKafkaFraudCheck")
						.log("\n/// Debtor Payments Lifecycle >>> ${body}")
						.bean(PaymentsLifecycleBean.class, "addStatusFraudCheck")
						.to("kafka:" + "debtor-payment-audit" + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

		from("kafka:" + "debtor-aml-check-output" + "?brokers=" + kafkaBootstrap + "&maxPollRecords="
				+ consumerMaxPollRecords + "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo
				+ "&groupId=" + consumerGroup + "&valueDeserializer="
				+ rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName()).routeId("FromKafkaAmlCheck")
						.log("\n/// Debtor Payments Lifecycle >>> ${body}")
						.bean(PaymentsLifecycleBean.class, "addStatusAmlCheck")
						.to("kafka:" + "debtor-payment-audit" + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

		from("kafka:" + "debtor-core-banking-output" + "?brokers=" + kafkaBootstrap + "&maxPollRecords="
				+ consumerMaxPollRecords + "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo
				+ "&groupId=" + consumerGroup + "&valueDeserializer="
				+ rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName()).routeId("FromKafkaCoreBanking")
						.log("\n/// Debtor Payments Lifecycle >>> ${body}")
						.bean(PaymentsLifecycleBean.class, "addStatusCoreBanking")
						.to("kafka:" + "debtor-payment-audit" + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

		from("kafka:" + "mock-rtp-incoming" + "?brokers=" + kafkaBootstrap + "&maxPollRecords=" + consumerMaxPollRecords
				+ "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo + "&groupId=" + consumerGroup
				+ "&valueDeserializer=" + rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName())
						.routeId("FromKafkaPaymentNetworkSent").log("\n/// Debtor Payments Lifecycle >>> ${body}")
						.bean(PaymentsLifecycleBean.class, "addStatusNetworkSent")
						.to("kafka:" + "debtor-payment-audit" + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

		from("kafka:" + "mock-rtp-debtor-confirmation" + "?brokers=" + kafkaBootstrap + "&maxPollRecords="
				+ consumerMaxPollRecords + "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo
				+ "&groupId=" + consumerGroup + "&valueDeserializer="
				+ rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName())
						.routeId("FromKafkaPaymentNetworkConfirmation")
						.log("\n/// Debtor Payments Lifecycle >>> ${body}")
						.bean(PaymentsLifecycleBean.class, "addStatusNetworkConfirmation")
						.to("kafka:" + "debtor-payment-audit" + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

	}
}
