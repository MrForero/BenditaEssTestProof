package com.benditaessence.technical_proof.domain.model;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private Long id;
    private String name;
    private String documentId;
    private String direction;
    private String city;
    private List<Delivery> deliveries;
}
