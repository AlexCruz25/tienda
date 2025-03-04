 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.tienda.service;

import com.api.tienda.model.Administrador;
import com.api.tienda.repository.IAdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AdministradorService implements IAdministradorService{
    
    @Autowired
    private IAdministradorRepository adminRepo;

    @Override
    public void saveAdministrador(Administrador admin) {
        adminRepo.save(admin);
      
    }

    @Override
    public Administrador buscarAdministrador(Long id) {
        Administrador admin=adminRepo.findById(id).orElse(null);
        return admin;
    }

    
    
}
