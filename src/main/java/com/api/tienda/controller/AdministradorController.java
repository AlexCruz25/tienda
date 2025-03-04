/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.controller;

import com.api.tienda.model.Administrador;
import com.api.tienda.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministradorController {
    
    @Autowired 
    private IAdministradorService adminServ;
    
    
    @PostMapping("/administrador/crear")
    public String saveAdministrador(@RequestBody Administrador admin){
        adminServ.saveAdministrador(admin);
        return "Administrador correctamente";
    }
    
    
            
    
    
}
