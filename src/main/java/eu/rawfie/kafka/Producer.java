package eu.rawfie.kafka;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;



import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import eu.rawfie.general.service.types.ExperimentStartRequest;
import eu.rawfie.uxv.Attitude;
import eu.rawfie.uxv.CpuUsage;
import eu.rawfie.uxv.FuelUsage;
import eu.rawfie.uxv.LaserScan;
//import eu.rawfie.uxv.nested.Header;
import eu.rawfie.uxv.commands.Header;
import eu.rawfie.uxv.commands.Location;
import eu.rawfie.uxv.SensorPublishControl;
import eu.rawfie.uxv.nested.SensorInfo;
import eu.rawfie.uxv.nested.SensorReadingScalar;
import eu.rawfie.uxv.nested.Unit;
import eu.rawfie.uxv.SensorType;
import eu.rawfie.uxv.StorageUsage;
import eu.rawfie.uxv.commands.Goto;
import eu.rawfie.uxv.nested.UxVHealthStatus;
import eu.rawfie.uxv.nested.UxVHealthStatusEnum;


public class Producer {
   


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		final String topic = "hmod_Goto";
		final Properties props = new Properties();

		props.put("bootstrap.servers", "eagle5.di.uoa.gr:9092");
		props.put("key.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
		props.put("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");

		props.put("schema.registry.url", "http://eagle5.di.uoa.gr:8081");

		//GoTo
		final Goto go = new Goto(new Header("uoa.kg.register","navigation",(long) 1000000000),new Location(0.0, 0.0, 0.0f, 0.0, 0.0, 0.0, 0.0f, 0.0f), 0.0f, 0.0f);
		final ProducerRecord<String, Goto> record = new ProducerRecord<String, Goto>(topic, go);
		final KafkaProducer<String, Goto > producer = new KafkaProducer<>(props);


		
		producer.send(record);
	    producer.close();

	}
}
