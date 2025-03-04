/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.controller;

import com.api.tienda.model.Carrito;
import com.api.tienda.model.Cliente;
import com.api.tienda.service.ICarritoService;
import com.api.tienda.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private IClienteService clienteServ;
    
    
    @GetMapping ("/cliente/traer")
    public List<Cliente> getClientes(){
        return clienteServ.getCliente();
    }
    
    @PostMapping("/cliente/crear")
    public String saveCliente(@RequestBody Cliente cli){
        clienteServ.saveCliente(cli);
        return"Cliene creado correctamente";
    }
    
    @DeleteMapping ("/cliente/borrar/ {id}")
    public void deleteCliente(@PathVariable Long id){
        clienteServ.deleteCliente(id);
    }
    
    
}
