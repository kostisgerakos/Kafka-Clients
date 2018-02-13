package eu.rawfie.kafka;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import eu.rawfie.uxv.commands.Header;
import eu.rawfie.uxv.commands.Location;

import eu.rawfie.uxv.commands.Goto;



public class Producer {
   


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		final String topic = "Goto";
		final Properties props = new Properties();

		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
		props.put("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");

		props.put("schema.registry.url", "localhost:8081");

		//GoTo
		final Goto go = new Goto(new Header("uregister","nav",(long) 1000000000),new Location(0.0, 0.0, 0.0f, 0.0, 0.0, 0.0, 0.0f, 0.0f), 0.0f, 0.0f);
		final ProducerRecord<String, Goto> record = new ProducerRecord<String, Goto>(topic, go);
		final KafkaProducer<String, Goto > producer = new KafkaProducer<>(props);


		
		producer.send(record);
	    producer.close();

	}
}
