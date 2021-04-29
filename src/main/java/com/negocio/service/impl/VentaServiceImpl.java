package com.negocio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negocio.model.Venta;
import com.negocio.repo.IGenericRepo;
import com.negocio.repo.IVentaRepo;
import com.negocio.service.IVentaService;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta, Integer> implements IVentaService{
	
	@Autowired
	private IVentaRepo repo;
	
	@Override
	protected IGenericRepo<Venta, Integer> getRepo() {		
		return repo;
	}

	@Override
	public Venta registrarTransaccional(Venta venta) {
		//INSERTAR CONSULTA -> OBTENER PK
		//INSERTER DETALLE CONSULTA <- USANDO LA PK PREVIA
		
		venta.getDetalleVenta().forEach(det -> det.setVenta(venta));
		
		return repo.save(venta);
	}
	
//	@Override
//	public Persona registrar(Persona per) {
//		return repo.save(per);
//	}
//
//	@Override
//	public Persona modificar(Persona per) {
//		return repo.save(per);
//	}
//
//	@Override
//	public List<Persona> listar() {
//		return repo.findAll();
//	}
//
//	@Override
//	public Persona listarPorId(Integer id) {
//		Optional<Persona> op = repo.findById(id);
//		return op.isPresent() ? op.get() : new Persona();
//	}
//
//	@Override
//	public void eliminar(Integer id) {
//		repo.deleteById(id);
//	}

}
