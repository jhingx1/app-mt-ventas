package com.negocio.service;

import java.util.List;

import com.negocio.model.Producto;

public interface IProductoService {
	Producto registrar(Producto per);
	Producto modificar(Producto per);
	List<Producto> listar();
	Producto listarPorId(Integer id);
	void eliminar(Integer id);
}
