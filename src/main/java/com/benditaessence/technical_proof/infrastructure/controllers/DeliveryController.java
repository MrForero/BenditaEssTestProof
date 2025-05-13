package com.benditaessence.technical_proof.infrastructure.controllers;

import com.benditaessence.technical_proof.domain.mappers.DeliveryMapper;
import com.benditaessence.technical_proof.domain.ports.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/{orderId}")
    public ResponseEntity<?> getADelivery(@PathVariable String orderId){
        try{
            return ResponseEntity.ok(deliveryService.getADelivery(orderId));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
