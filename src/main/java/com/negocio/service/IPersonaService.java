package com.negocio.service;

import java.util.List;

import com.negocio.model.Persona;

public interface IPersonaService {
	Persona registrar(Persona per);
	Persona modificar(Persona per);
	List<Persona> listar();
	Persona listarPorId(Integer id);
	void eliminar(Integer id);
}
