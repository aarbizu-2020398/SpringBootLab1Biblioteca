package com.adrianarbizu.webapp.biblioteca.service;

import java.util.List;

import com.adrianarbizu.webapp.biblioteca.model.Cliente;


public interface IClienteService {
    
    public List<Cliente> listarCliente();

    public void guardarCliente(Cliente cliente);

    public Cliente busClientePorDPI(Long DPI);

    public void eliminarCliente(Cliente cliente);
}
