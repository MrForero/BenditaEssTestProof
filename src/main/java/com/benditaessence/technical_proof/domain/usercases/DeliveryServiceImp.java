package com.benditaessence.technical_proof.domain.usercases;

import com.benditaessence.technical_proof.domain.exceptions.DeliveryException;
import com.benditaessence.technical_proof.domain.mappers.DeliveryMapper;
import com.benditaessence.technical_proof.domain.model.Delivery;
import com.benditaessence.technical_proof.domain.ports.DeliveryService;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.DeliveryDto;
import com.benditaessence.technical_proof.infrastructure.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImp implements DeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Autowired
    private DeliveryRepository deliveryRepository;


    @Override
    public void createADelivery(DeliveryDto dto) throws DeliveryException {
        if(deliveryRepository.existsByOrderId(dto.getOrderId())){
            throw new DeliveryException(DeliveryException.DELIVERY_EXISTING+dto.getOrderId());
        }

        Delivery model = deliveryMapper.toModel(dto);
        deliveryRepository.save(deliveryMapper.toEntity(model));
    }

    @Override
    public Delivery getADelivery(String orderId) throws DeliveryException {
        if(!deliveryRepository.existsByOrderId(orderId)){
            throw new DeliveryException(DeliveryException.DELIVERY_NOT_FOUND+orderId);
        }
        return deliveryMapper.toModel(deliveryRepository.getByOrderId(orderId));
    }
}
