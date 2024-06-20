package com.treinamento.javaspring.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String serie;

    private String genero;

    @Temporal(TemporalType.DATE)
    private Date dataCadastro = new Date();


    public Long getId() {
        return id;
    }
}
