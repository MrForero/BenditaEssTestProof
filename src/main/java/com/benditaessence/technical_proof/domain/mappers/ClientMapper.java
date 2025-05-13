package com.benditaessence.technical_proof.domain.mappers;

import com.benditaessence.technical_proof.domain.model.Client;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.ClientDto;
import com.benditaessence.technical_proof.infrastructure.repositories.entities.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DeliveryMapper.class})
public interface ClientMapper {

    // Entity <-> Model
    @Mapping(target = "deliveries", source = "deliveries")
    Client toModel(ClientEntity entity);

    @Mapping(target = "deliveries", source = "deliveries")
    ClientEntity toEntity(Client model);

    // Model <-> DTO
    @Mapping(target = "deliveries", source = "deliveries")
    ClientDto toDto(Client model);

    @Mapping(target = "deliveries", source = "deliveries")
    Client toModel(ClientDto dto);
}