package com.springboot.kafka.springbootkafka.config;

import com.springboot.kafka.springbootkafka.dto.KafkaMessage;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaConsumerConfiguration {

    @Value("${k.kafka.address}")
    private String kafkaAddress;

    @Value("${k.kafka.group.id}")
    private String groupId;

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, KafkaMessage> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, KafkaMessage> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        /*factory.setRecordFilterStrategy(record ->
                record.value().toString().contains("topic1"));*/
        return factory;
    }

    @Bean
    public ConsumerFactory<String, KafkaMessage> consumerFactory() { //Kafkadaki veriyi tüketen
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaAddress);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(JsonDeserializer.VALUE_DEFAULT_TYPE, KafkaMessage.class);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(props);
    }

}
