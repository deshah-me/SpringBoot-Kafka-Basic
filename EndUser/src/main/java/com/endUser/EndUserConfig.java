package com.endUser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class EndUserConfig {

    Logger logger = LoggerFactory.getLogger(EndUserConfig.class);

    @KafkaListener(topics = EndUserConstant.LOCATION_UPDATE_TOPIC, groupId = EndUserConstant.GROUP_ID)
    public void updatedLocation(String value) {
        this.logger.info(value);
    }
}
