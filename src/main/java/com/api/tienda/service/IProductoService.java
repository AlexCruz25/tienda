/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Producto;
import java.util.List;



public interface IProductoService {
    public void saveProducto (Producto producto);
    
    public List<Producto>getProductos();
    
   public void deleteProducto(Long id);
   
   public Producto buscarProducto(Long id);
   
    
}
