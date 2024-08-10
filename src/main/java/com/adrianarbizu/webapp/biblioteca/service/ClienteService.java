package com.adrianarbizu.webapp.biblioteca.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianarbizu.webapp.biblioteca.model.Cliente;
import com.adrianarbizu.webapp.biblioteca.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarCliente() {
    return clienteRepository.findAll();
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente busClientePorDPI(Long DPI) {
        return clienteRepository.findById(DPI).orElse(null);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepository.delete(cliente); 
    }
}

