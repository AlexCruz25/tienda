/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Carrito;
import com.api.tienda.repository.ICarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService implements ICarritoService{
    
    @Autowired
    private ICarritoRepository carritoRepo;

    @Override
    public void saveCarrito(Carrito carro) {
        carritoRepo.save(carro);
    }

    @Override
    public Carrito buscarCarrito(Long id) {
        Carrito carro= carritoRepo.findById(id).orElse(null);
        return carro;
    }
    
}
