package com.negocio.service;

import com.negocio.model.Venta;

public interface IVentaService extends ICRUD<Venta,Integer>{
//	Persona registrar(Persona per);
//	Persona modificar(Persona per);
//	List<Persona> listar();
//	Persona listarPorId(Integer id);
//	void eliminar(Integer id);
	
	Venta registrarTransaccional(Venta venta);
	
}