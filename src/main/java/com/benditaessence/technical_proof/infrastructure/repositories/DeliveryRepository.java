package com.benditaessence.technical_proof.infrastructure.repositories;

import com.benditaessence.technical_proof.infrastructure.repositories.entities.DeliveryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryEntity, Long> {
    DeliveryEntity getByOrderId(String docId);
    Boolean existsByOrderId(String docId);
}
