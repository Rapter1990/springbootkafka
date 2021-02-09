package com.springboot.kafka.springbootkafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaMessage {

    private String message;

    private String id = UUID.randomUUID().toString();

    private LocalDateTime messageDate = LocalDateTime.now();

    @Override
    public String toString() {
        return "KafkaMessage{" +
                "message='" + message + '\'' +
                ", id='" + id + '\'' +
                ", messageDate=" + messageDate +
                '}';
    }

}
