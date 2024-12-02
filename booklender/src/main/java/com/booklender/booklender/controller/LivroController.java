package com.booklender.booklender.controller;

import com.booklender.booklender.model.Livro;
import com.booklender.booklender.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody @Valid Livro livro) {
        return ResponseEntity.ok(livroRepository.save(livro));
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarLivros() {
        return ResponseEntity.ok(livroRepository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro livroDetalhes) {
        Livro livro = livroRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        livro.setTitulo(livroDetalhes.getTitulo());
        livro.setAutor(livroDetalhes.getAutor());
        livro.setQuantidadeDisponivel(livroDetalhes.getQuantidadeDisponivel());
        return ResponseEntity.ok(livroRepository.save(livro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        livroRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
