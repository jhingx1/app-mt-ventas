package com.negocio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.negocio.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
