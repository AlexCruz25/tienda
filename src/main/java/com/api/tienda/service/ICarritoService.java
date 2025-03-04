/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Carrito;



public interface ICarritoService {
    public void saveCarrito(Carrito carro);
    
    public Carrito buscarCarrito(Long id);
    
    
}
