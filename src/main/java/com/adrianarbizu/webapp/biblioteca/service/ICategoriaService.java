package com.adrianarbizu.webapp.biblioteca.service;

import java.util.List;

import com.adrianarbizu.webapp.biblioteca.model.Categoria;


public interface ICategoriaService {
    
    public List<Categoria> listarCategorias();

    public void guardarCategoria(Categoria categoria);

    public Categoria busCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);
}
