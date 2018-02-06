package eu.rawfie.kafka;

import java.util.Arrays;
import java.util.Properties;

//Use of new org.apache.kafka.clients.consumer package 
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import eu.rawfie.uxv.commands.Goto;



public class Consumer {
	public static void main(String[] args) {
		final String topic = "hmod_Goto";
		final Properties props = new Properties();
		//Basic properties values
		props.put("bootstrap.servers", "eagle5.di.uoa.gr:9092");
		props.put("enable.auto.commit", "false");
		props.put("group.id", "LocationConsumer");
		props.put("key.deserializer", "io.confluent.kafka.serializers.KafkaAvroDeserializer");
		props.put("value.deserializer", "io.confluent.kafka.serializers.KafkaAvroDeserializer");
		props.put("schema.registry.url", "http://172.19.0.18:8081");
		props.put("specific.avro.reader", "true");

		final KafkaConsumer<String, Goto> consumer = new KafkaConsumer<>(props);
		consumer.subscribe(Arrays.asList(topic));
		while (true) {
			//poll loop
			final ConsumerRecords<String, Goto> r = consumer.poll(1000);
			for (ConsumerRecord<String, Goto> rr : r) {
				System.out.println(rr.value());
			}
		}

	}
}
