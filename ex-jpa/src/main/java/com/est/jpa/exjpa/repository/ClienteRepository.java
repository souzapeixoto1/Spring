package com.est.jpa.exjpa.repository;

import com.est.jpa.exjpa.model.Cliente;
import org.apache.catalina.startup.CredentialHandlerRuleSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Component
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente>findLastName(String sobrenome);

    Cliente findById(long id);

    List<Cliente>findName(String nome);

}
