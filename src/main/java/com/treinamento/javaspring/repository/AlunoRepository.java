package com.treinamento.javaspring.repository;

import com.treinamento.javaspring.models.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno,Long> {

}
