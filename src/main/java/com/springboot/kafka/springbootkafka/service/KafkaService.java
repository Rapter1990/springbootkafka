package com.springboot.kafka.springbootkafka.service;

import com.springboot.kafka.springbootkafka.dto.KafkaMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KafkaService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    @KafkaListener(
            topicPartitions = @TopicPartition(
                    topic = "${k.kafka.topic}",
                    partitionOffsets = { @PartitionOffset(
                            partition = "0",
                            initialOffset = "0") }),
            groupId = "${k.kafka.group.id}"
    )
    public void listen(@Payload KafkaMessage kafkaMessage) {
        logger.info("MessageInfo : {}", kafkaMessage);
    }

}
