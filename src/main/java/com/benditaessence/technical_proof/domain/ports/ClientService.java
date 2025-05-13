package com.benditaessence.technical_proof.domain.ports;

import com.benditaessence.technical_proof.domain.exceptions.ClientException;
import com.benditaessence.technical_proof.domain.model.Client;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.ClientDto;

public interface ClientService {
    void createAClient(ClientDto dto) throws ClientException;
    Client getAClient(String docId) throws ClientException;
}
