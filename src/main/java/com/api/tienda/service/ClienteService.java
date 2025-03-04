/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Carrito;
import com.api.tienda.model.Cliente;
import com.api.tienda.repository.ICarritoRepository;
import com.api.tienda.repository.IClienteRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ClienteService implements IClienteService {
    
    @Autowired
    private IClienteRepository clienteRepo;
    
    @Autowired
    private ICarritoRepository carritoRepo;

    @Override
    public void saveCliente(Cliente cliente) {
       
        
       if(cliente.getCarrito()==null){
         Carrito carro= new Carrito();
        carro= carritoRepo.save(carro);
        
        cliente.setCarrito(carro);
        carro.setCliente(cliente);// relacion bidireccional
        //guarda el cliente en la Base de datos
       }
        clienteRepo.save(cliente);
       
    }

    @Override
    public Cliente buscarCliente(Long id) {
            Cliente cli= clienteRepo.findById(id).orElse(null);
            return cli;
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public List<Cliente> getCliente() {
        return clienteRepo.findAll();
    }

    @Override
    public String loginCliente(String email, String password) {
        return "Hola";
    }
    
}
