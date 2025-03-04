/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.controller;

import com.api.tienda.model.Carrito;
import com.api.tienda.service.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarritoController {
    
    @Autowired
    private ICarritoService carritoServ;
    
    @PostMapping ("/carrito/crear")
    public String saveCarrito(@RequestBody Carrito carro){
        carritoServ.saveCarrito(carro);
        return "Carrito Creado";
    }
    
}
    