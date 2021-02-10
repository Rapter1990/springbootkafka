package com.springboot.kafka.springbootkafka.controller;

import com.springboot.kafka.springbootkafka.dto.KafkaMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/kafkamessage")
public class KafkaController {

    private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @Value("${k.kafka.topic}")
    private String kafkaTopic;

    @Autowired
    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    @PostMapping
    public void sendMessage(@RequestBody KafkaMessage kafkaMessage) {

        UUID messageUUID = UUID.randomUUID();

        ListenableFuture<SendResult<String, KafkaMessage>> future = kafkaTemplate.send(kafkaTopic, messageUUID.toString(), kafkaMessage);

        future.addCallback(new ListenableFutureCallback<SendResult<String, KafkaMessage>>() {

            @Override
            public void onSuccess(SendResult<String, KafkaMessage> result) {
                logger.info("Sent message=[{}] with offset=[{}}]", kafkaMessage, result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                logger.error("Unable to send message=[{}] due to : {}", kafkaMessage, ex.getMessage());
            }
        });

    }

}
