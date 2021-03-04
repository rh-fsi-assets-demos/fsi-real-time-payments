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
import org.springframework.context.annotation.ImportResource;

/**
 * A spring-boot application that includes a Camel route builder to setup the
 * Camel routes
 */
@SpringBootApplication
@ImportResource({ "classpath:spring/camel-context.xml" })
public class Application extends RouteBuilder {

	private String kafkaBootstrap = System.getenv("BOOTSTRAP_SERVERS");
	private String kafkaConsumerTopic = System.getenv("CONSUMER_TOPIC");
	private String kafkaProducerTopic = System.getenv("PRODUCER_TOPIC");
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

		from("kafka:" + kafkaConsumerTopic + "?brokers=" + kafkaBootstrap + "&maxPollRecords=" + consumerMaxPollRecords
				+ "&consumersCount=" + consumerCount + "&seekTo=" + consumerSeekTo + "&groupId=" + consumerGroup
				+ "&valueDeserializer=" + rtp.demo.domain.payment.serde.PaymentDeserializer.class.getName())
						.routeId("FromKafka").log("\n/// Creditor Payment Validation >>> ${body}")
						.to("kafka:" + kafkaProducerTopic + "?serializerClass="
								+ rtp.demo.domain.payment.serde.PaymentSerializer.class.getName());

	}
}
