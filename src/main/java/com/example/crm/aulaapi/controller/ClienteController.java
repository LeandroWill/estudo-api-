package com.example.crm.aulaapi.controller;

import com.example.crm.aulaapi.model.Cliente;
import com.example.crm.aulaapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/listar")
    public List<Cliente> listar(){

        return clienteRepository.findAll();

    }

    @PostMapping("/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
