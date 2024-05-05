// Importamos los paquetes
package com.apirest.apirest.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Indicamos la entidad de la base de datos
@Entity
public class Producto {
    // Definimos el id como clave primaria
    @Id
    // Definimos el id como autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Los atributos de la clase Producto
    private Long id;
    private String nombre;
    private BigDecimal precio;

    // Generar los Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }


}
