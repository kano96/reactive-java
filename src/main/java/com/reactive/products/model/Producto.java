package com.reactive.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private int codProducto;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stock;
}
