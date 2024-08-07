package com.adrianarbizu.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarbizu.webapp.biblioteca.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
