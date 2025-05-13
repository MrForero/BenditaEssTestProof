package com.benditaessence.technical_proof.domain.usercases;

import com.benditaessence.technical_proof.domain.exceptions.ClientException;
import com.benditaessence.technical_proof.domain.mappers.ClientMapper;
import com.benditaessence.technical_proof.domain.mappers.DeliveryMapper;
import com.benditaessence.technical_proof.domain.model.Client;
import com.benditaessence.technical_proof.domain.model.Delivery;
import com.benditaessence.technical_proof.domain.ports.ClientService;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.ClientDto;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.DeliveryDto;
import com.benditaessence.technical_proof.infrastructure.repositories.ClientRepository;
import com.benditaessence.technical_proof.infrastructure.repositories.entities.ClientEntity;
import com.benditaessence.technical_proof.infrastructure.repositories.entities.DeliveryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void createAClient(ClientDto dto) throws ClientException {
        if(clientRepository.existsByDocumentId(dto.getDocumentId())){
            throw new ClientException(ClientException.CLIENT_EXISTING+dto.getDocumentId());
        }
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setDocumentId(dto.getDocumentId());
        clientEntity.setName(dto.getName());
        clientEntity.setDirection(dto.getDirection());
        clientEntity.setCity(dto.getCity());

        List<DeliveryEntity> deliveryEntities = new ArrayList<>();
        if (dto.getDeliveries() != null) {
            for (DeliveryDto deliveryDto : dto.getDeliveries()) {
                DeliveryEntity deliveryEntity = deliveryMapper.toEntity(deliveryMapper.toModel(deliveryDto));
                deliveryEntity.setClient(clientEntity);
                deliveryEntities.add(deliveryEntity);
            }
        }

        clientEntity.setDeliveries(deliveryEntities);

        clientRepository.save(clientEntity);
    }

    @Override
    public Client getAClient(String docId) throws ClientException {
        if(!clientRepository.existsByDocumentId(docId)){
            throw new ClientException(ClientException.CLIENT_NOT_FOUND+docId);
        }

        return clientMapper.toModel(clientRepository.getByDocumentId(docId));
    }
}
