/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.TipoProducto;
import com.api.tienda.repository.ITipoProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProductoService implements ITipoProductoService {
    
    @Autowired
    private ITipoProductoRepository tipoProductoRepo;

    @Override
    public void saveTipoProducto(TipoProducto tipoProducto) {
        tipoProductoRepo.save(tipoProducto);
    }

    @Override
    public TipoProducto buscarTipoProducto(Long id) {
        TipoProducto tipo= tipoProductoRepo.findById(id).orElse(null);
        return tipo;
    }

    @Override
    public List<TipoProducto> getTipoProductos() {
       return tipoProductoRepo.findAll();
    }

    @Override
    public void deleteTipoProducto(Long id) {
        tipoProductoRepo.deleteById(id);
    }
    
}
