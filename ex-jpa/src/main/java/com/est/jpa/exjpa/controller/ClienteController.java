package com.est.jpa.exjpa.controller;

import ch.qos.logback.core.net.server.Client;
import com.est.jpa.exjpa.model.Cliente;
import com.est.jpa.exjpa.repository.ClienteRepository;
import com.est.jpa.exjpa.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity add(@RequestBody Cliente cliente) {
        clienteService.addCliente(cliente);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable(required = true)long id) {
        return clienteService.findId(id);
    }

    @GetMapping("/lastName")
    public void findByLastName(@RequestBody String sobrenome) {
        clienteService.findLastname(sobrenome);
    }




    /*private ClienteService clienteService;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Cliente> listar() {
        return clienteService.
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cliente findId(@PathVariable Long id) {
        return clienteRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletaCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }

    @PutMapping
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        Optional<Cliente> clienteOpcional = clienteRepository.findById(cliente.getId());

        if (clienteOpcional.isPresent()) {
            Cliente antigoCliente = clienteOpcional.get();
            antigoCliente.setNome(cliente.getNome());
            antigoCliente.setSobrenome(cliente.getSobrenome());
            clienteRepository.save(antigoCliente);
            return antigoCliente;
        } else {
            return new Cliente();
        }

        }

     */

}


