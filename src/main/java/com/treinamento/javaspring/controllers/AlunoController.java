package com.treinamento.javaspring.controllers;

import com.treinamento.javaspring.models.Aluno;
import com.treinamento.javaspring.repository.AlunoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    // Método POST
    @CrossOrigin("*")
    @PostMapping("/cadastrar")
    public Aluno cadastrar(@RequestBody Aluno obj) {

        return alunoRepository.save(obj);

    }

    // Método GET
    @CrossOrigin("*")
    @GetMapping("/listar")
    public Iterable<Aluno> listar() {
        return alunoRepository.findAll();
    }

    // Método GET (por id)
    @CrossOrigin("*")
    @GetMapping("/{id}")
    public Optional<Aluno> listarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id);
    }

    // Método DELETE (por id)
    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerAluno(@PathVariable Long id){
        alunoRepository.deleteById(id);
        return  ResponseEntity.ok().build();
    }

    // Método PUT
    @CrossOrigin("*")
    @PutMapping
    public Aluno atualizarAluno(@RequestBody Aluno obj){
        if(obj.getId() >0) {
            return alunoRepository.save(obj);
        } return obj;
    }









}


