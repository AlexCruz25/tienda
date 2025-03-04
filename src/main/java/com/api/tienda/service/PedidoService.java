/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Pedido;
import com.api.tienda.repository.IPedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoService implements IPedidoService {
    
    @Autowired
    private IPedidoRepository pedidoRepo;

    @Override
    public List<Pedido> getPedidos() {
        return pedidoRepo.findAll();
    }

    @Override
    public void savePedido(Pedido pedido) {
        pedidoRepo.save(pedido);
    }

    @Override
    public Pedido buscarPedido(Long id) {
        Pedido pedido= pedidoRepo.findById(id).orElse(null);
        return pedido;
    }

    @Override
    public void deletePedido(Long id) {
        pedidoRepo.deleteById(id);
    }
    
}
