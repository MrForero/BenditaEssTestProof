package com.benditaessence.technical_proof.infrastructure.controllers.dtos;

import com.benditaessence.technical_proof.domain.model.Client;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "client")
public class DeliveryDto {
    private String orderId;
    private String description;
    private Date deliveryDate;
    @JsonBackReference
    private ClientDto client;
}
