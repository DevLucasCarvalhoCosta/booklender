package com.booklender.booklender.repository;

import com.booklender.booklender.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {}
