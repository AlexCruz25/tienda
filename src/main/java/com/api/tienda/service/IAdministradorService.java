/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Administrador;
import org.springframework.http.ResponseEntity;


public interface IAdministradorService {
    public void saveAdministrador(Administrador admin);
    
    public Administrador buscarAdministrador(Long id);
    
   
    
}
