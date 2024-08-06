package com.adrianarbizu.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianarbizu.webapp.biblioteca.model.Categoria;
import com.adrianarbizu.webapp.biblioteca.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listarCategorias() {
       return categoriaRepository.findAll();
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
       categoriaRepository.save(categoria);
    }

    @Override
    public Categoria busCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {

    }


}