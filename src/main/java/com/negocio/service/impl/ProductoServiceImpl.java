package com.negocio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.negocio.model.Producto;
import com.negocio.repo.IGenericRepo;
import com.negocio.repo.IProductoRepo;
import com.negocio.service.IProductoService;



@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService{
	
	@Autowired
	private IProductoRepo repo;
	
	@Override
	protected IGenericRepo<Producto, Integer> getRepo() {		
		return repo;
	}
	
//	@Override
//	public Producto registrar(Producto per) { 
//		return repo.save(per);
//	}
//
//	@Override
//	public Producto modificar(Producto per) {
//		return repo.save(per);
//	}
//
//	@Override
//	public List<Producto> listar() {
//		return repo.findAll();
//	}
//
//	@Override
//	public Producto listarPorId(Integer id) {
//		Optional<Producto> op = repo.findById(id);
//		return op.isPresent() ? op.get() : new Producto();
//	}
//
//	@Override
//	public void eliminar(Integer id) {
//		repo.deleteById(id);
//	}

}
