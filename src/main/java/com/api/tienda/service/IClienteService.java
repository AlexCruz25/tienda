/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Cliente;
import java.util.List;



public interface IClienteService{
    
    public void saveCliente(Cliente cliente);
    
    public Cliente buscarCliente(Long id);
    
    public void deleteCliente(Long id);
    
    public List<Cliente> getCliente();
    
    public String loginCliente(String email, String password);
    
}
