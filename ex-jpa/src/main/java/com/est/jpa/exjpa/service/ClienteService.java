package com.est.jpa.exjpa.service;

import com.est.jpa.exjpa.controller.ClienteController;
import com.est.jpa.exjpa.model.Cliente;
import com.est.jpa.exjpa.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@RequiredArgsConstructor
public class ClienteService {

    @Autowired
    private final ClienteRepository clienteRepository;

    public void addCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public Cliente findId(long id){
        return clienteRepository.findById(id);
    }

    public void findLastname(String sobrenome){
        clienteRepository.findLastName(sobrenome);
    }


}
