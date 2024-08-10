package com.adrianarbizu.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarbizu.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
