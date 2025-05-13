package com.benditaessence.technical_proof.domain.exceptions;

public class DeliveryException extends RuntimeException{
    public static final String DELIVERY_NOT_FOUND = "ENTREGA NO ENCONTRADA CON EL NUMERO DE ORDEN ";
    public static final String DELIVERY_EXISTING = "ENTREGA EXISTENTE CON NUMERO DE ORDEN ";

    public DeliveryException(String msg){
        super(msg);
    }
}
