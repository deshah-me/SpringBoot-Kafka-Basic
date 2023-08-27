package com.deliveryboy.controller;

import com.deliveryboy.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/updateLocation")
    public ResponseEntity<?> updateLocation() {

        for(int i=0;i<10000;i++) {
            this.deliveryService.updateLocation("(" + (Math.random() * 100) + " , " + (Math.random() * 100) + ")");
        }
        return new ResponseEntity<>(Map.of("message", "Location Updated Controller message"), HttpStatus.OK);
    }
}
