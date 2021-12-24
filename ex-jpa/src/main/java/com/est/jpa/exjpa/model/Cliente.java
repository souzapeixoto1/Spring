package com.est.jpa.exjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //faz com que o banco de dados incremente e não o nosso código
    private Long id;
    private String nome;
    private String sobrenome;

}
