package com.benditaessence.technical_proof.infrastructure.controllers;

import com.benditaessence.technical_proof.domain.mappers.ClientMapper;
import com.benditaessence.technical_proof.domain.ports.ClientService;
import com.benditaessence.technical_proof.infrastructure.controllers.dtos.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientService clientService;

    @GetMapping("/{documentId}")
    public ResponseEntity<?> getAClient(@PathVariable String documentId){
        try{
            return ResponseEntity.ok(clientMapper.toDto(clientService.getAClient(documentId)));
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<?> createAClient(@RequestBody ClientDto dto){
        try{
            clientService.createAClient(dto);
            return ResponseEntity.ok("CLIENTE CREADO EXISTOSAMENTE");
        } catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
