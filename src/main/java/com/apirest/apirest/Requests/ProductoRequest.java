package com.apirest.apirest.Requests;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ProductoRequest {
    // Definimos los atributos de validacion de entrada de nombre
    @NotBlank(message = "El nombre del producto es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre del producto debe tener entre 3 y 50 caracteres")
    @NotNull(message = "El nombre del producto no puede ser nulo")
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
