package com.terror_al_ejecutar.ecommerce.service;

import com.terror_al_ejecutar.ecommerce.dto.CarritoDto;

import java.util.List;

public interface CarritoService {
    //GET ALL
    List<CarritoDto> findAll();
    //GET BY ID
    CarritoDto findById(Long id);
    //POST

    void save(CarritoDto carritoDto);

    void deleteById(Long id);
}
