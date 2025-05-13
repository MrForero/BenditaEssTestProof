package com.benditaessence.technical_proof.infrastructure.repositories.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "deliveries")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "client")
public class DeliveryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String orderId;
    private String description;
    private Date deliveryDate;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    private ClientEntity client;
}
