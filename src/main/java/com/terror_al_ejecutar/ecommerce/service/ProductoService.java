package com.terror_al_ejecutar.ecommerce.service;

import com.terror_al_ejecutar.ecommerce.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Productos> findAll();

    Optional<Productos> findById(Long id);

    void save(Productos productos);

    void deleteById(Long id);
}
