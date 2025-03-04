/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Pedido;
import java.util.List;



public interface IPedidoService {   
    
    public List<Pedido>getPedidos(); 
    
    public void savePedido (Pedido pedido);
    
    public Pedido buscarPedido(Long id);
    
    public void deletePedido (Long id);
}
