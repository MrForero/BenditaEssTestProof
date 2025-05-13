package com.benditaessence.technical_proof.infrastructure.repositories;

import com.benditaessence.technical_proof.infrastructure.repositories.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
    ClientEntity getByDocumentId(String docId);
    Boolean existsByDocumentId(String docId);
}
