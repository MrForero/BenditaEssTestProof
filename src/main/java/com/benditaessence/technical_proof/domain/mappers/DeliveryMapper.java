package com.benditaessence.technical_proof.domain.mappers;

import com.benditaessence.technical_proof.domain.model.Delivery;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.DeliveryDto;
import com.benditaessence.technical_proof.infrastructure.repositories.entities.DeliveryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {

    @Mapping(target = "client", ignore = true)
    Delivery toModel(DeliveryEntity entity);

    DeliveryEntity toEntity(Delivery model);

    @Mapping(target = "client", ignore = true)
    DeliveryDto toDto(Delivery model);

    @Mapping(target = "client", ignore = true)
    Delivery toModel(DeliveryDto dto);
}

