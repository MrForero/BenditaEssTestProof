package com.benditaessence.technical_proof.domain.exceptions;

public class ClientException extends RuntimeException{
    public static final String CLIENT_NOT_FOUND = "CLIENTE NO ENCONTRADO CON EL DOCUMENTO ";
    public static final String CLIENT_EXISTING = "EL CLIENTE YA SE ENCUENTRA REGISTRADO ";

    public ClientException(String msg){
        super(msg);
    }
}
