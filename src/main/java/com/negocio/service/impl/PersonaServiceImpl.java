package com.negocio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negocio.model.Persona;
import com.negocio.repo.IPersonaRepo;
import com.negocio.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public Persona registrar(Persona per) {
		return repo.save(per);
	}

	@Override
	public Persona modificar(Persona per) {
		return repo.save(per);
	}

	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		Optional<Persona> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Persona();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
