package com.benditaessence.technical_proof.domain.ports;

import com.benditaessence.technical_proof.domain.exceptions.DeliveryException;
import com.benditaessence.technical_proof.domain.model.Delivery;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.DeliveryDto;

public interface DeliveryService {
    void createADelivery(DeliveryDto dto) throws DeliveryException;
    Delivery getADelivery(String orderId) throws DeliveryException;
}
