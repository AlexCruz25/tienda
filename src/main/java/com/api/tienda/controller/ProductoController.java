/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.controller;

import com.api.tienda.model.Producto;
import com.api.tienda.service.IProductoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {
    
    @Autowired
    private IProductoService productoServ;
    
    
    @PostMapping("/crear")
    public String saveProducto(@RequestBody Producto producto){
        productoServ.saveProducto(producto);
        return "Producto creado";
    }
    
    @DeleteMapping ("/delete/{id}")
    public String deleteProducto(@PathVariable Long id){
        productoServ.deleteProducto(id);
        return "Producto eliminado";
    }
    
    @GetMapping("/traer")
    public List<Producto> getProductos(){
        return productoServ.getProductos();
    }
    
}
