package com.benditaessence.technical_proof.infrastructure.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private String name;
    private String documentId;
    private String direction;
    private String city;

    @JsonManagedReference
    private List<DeliveryDto> deliveries;
}
