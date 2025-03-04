/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Producto;
import com.api.tienda.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {
    
    @Autowired 
    private IProductoRepository productoRepo;
    

    @Override
    public void saveProducto(Producto producto) {
        productoRepo.save(producto);
        
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepo.findAll();
    }

    @Override
    public void deleteProducto(Long id) {
         productoRepo.deleteById(id);
    }

    @Override
    public Producto buscarProducto(Long id) {
        Producto producto = productoRepo.findById(id).orElse(null);
        return producto;
    }
    
}
