package com.adrianarbizu.webapp.biblioteca.service;


import java.util.List;

import com.adrianarbizu.webapp.biblioteca.model.Libro;

public interface ILibroService  {

    
 

    public List<Libro> listarLibro();

    public Libro busLibroPorId(Long id);

    public Libro guardarLibro(Libro libro);

    public void  eliminarLibro(Libro libro);
}