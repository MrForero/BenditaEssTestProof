package com.benditaessence.technical_proof.domain.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "client")
public class Delivery {
    private Long id;
    private String orderId;
    private String description;
    private Date deliveryDate;
    private Client client;
}
