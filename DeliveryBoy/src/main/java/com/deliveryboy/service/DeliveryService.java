package com.deliveryboy.service;

import com.deliveryboy.config.KafkaConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;//bean will be available in the kafka container hence autowired

private Logger logger=LoggerFactory.getLogger(DeliveryService.class);

    public boolean updateLocation(String location) {
        this.kafkaTemplate.send(KafkaConstant.LOCATION_TOPIC_NAME, location);
        this.logger.info("Location Updated Service message");
        return true;
    }
}
