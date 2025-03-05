
package com.api.tienda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String edad;
    private String email;
    private String password;
    
    
    @OneToOne
    @JoinColumn(name= "carrito_id", referencedColumnName="id")      
    private Carrito carrito;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String edad, String email, String password, Carrito carrito) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.password = password;
        this.carrito = carrito;
    }

   
    
    
}
