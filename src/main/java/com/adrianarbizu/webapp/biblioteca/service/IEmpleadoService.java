package com.adrianarbizu.webapp.biblioteca.service;

import java.util.List;

import com.adrianarbizu.webapp.biblioteca.model.Empleado;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleado();

    public void guardarEmpleado(Empleado empleado);

    public Empleado busEmpleadoPorId(Long Id);

    public void eliminarEmpleado(Empleado empleado);
}
