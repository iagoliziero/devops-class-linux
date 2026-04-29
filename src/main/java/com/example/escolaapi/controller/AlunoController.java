package com.example.escola_api.controller;
import com.example.escola_api.model.Aluno;
import com.example.escola_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repo;

    @GetMapping
    public List<Aluno> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return repo.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
