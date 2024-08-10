package com.adrianarbizu.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarbizu.webapp.biblioteca.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}