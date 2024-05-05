package com.apirest.apirest.Requests;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public class ProductoRequest {
    // Definimos los atributos de validacion de entrada de nombre
    @NotBlank(message = "El nombre del producto es obligatorio")
    private String nombre;
    // Definimos los atributos de la validacion de entrada de precio
    @PositiveOrZero(message = "El precio del producto debe ser positivo o cero")
    private BigDecimal precio;


    // Getters y setters
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
