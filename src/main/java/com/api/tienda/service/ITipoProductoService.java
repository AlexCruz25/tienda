/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.TipoProducto;
import java.util.List;



public interface ITipoProductoService {
    
    public void saveTipoProducto(TipoProducto tipoProducto);
    
    public TipoProducto buscarTipoProducto(Long id);
    
    public List<TipoProducto> getTipoProductos();
    
    public void deleteTipoProducto(Long id);
     
}
