package com.adrianarbizu.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianarbizu.webapp.biblioteca.model.Libro;
import com.adrianarbizu.webapp.biblioteca.repository.LibroRepository;

@Service
public class LibroService implements ILibroService {

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> listarLibro() {
        return libroRepository.findAll();

    }

    @Override
    public Libro guardarLibro(Libro libro) {
        libroRepository.save(libro);
        return libro;

    }

    @Override
    public Libro busLibroPorId(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepository.delete(libro);
    }

}
