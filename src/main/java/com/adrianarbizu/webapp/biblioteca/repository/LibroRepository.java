package com.adrianarbizu.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarbizu.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
