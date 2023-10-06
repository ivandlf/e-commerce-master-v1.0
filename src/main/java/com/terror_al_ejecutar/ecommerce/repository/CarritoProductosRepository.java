package com.terror_al_ejecutar.ecommerce.repository;

import com.terror_al_ejecutar.ecommerce.models.CarritoProductos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarritoProductosRepository extends CrudRepository<CarritoProductos, Long> {

    List<CarritoProductos> findAllByCarritoId(Long CarritoId);
}
