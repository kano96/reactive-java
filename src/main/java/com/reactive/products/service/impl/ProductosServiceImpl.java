package com.reactive.products.service.impl;

import com.reactive.products.model.Producto;
import com.reactive.products.service.ProductosService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {
    private static ArrayList<Producto> productos = new ArrayList<>(List.of(
            new Producto(101, "Leche", "Alimentación", 1.20, 15),
            new Producto(102, "Jabon", "Limpieza", 0.89, 30),
            new Producto(103, "Mesa", "Hogar", 125, 4),
            new Producto(104, "Television", "Hogar", 650, 10),
            new Producto(105, "Huevos", "Alimentación", 2.20, 3),
            new Producto(105, "Fregona", "Limpieza", 3.40, 6),
            new Producto(105, "Detergente", "Limpieza", 8.70, 12)
    ));


    @Override
    public Flux<Producto> catalogo() {
        return Flux.fromIterable(productos)
                .delayElements(Duration.ofSeconds(2));
    }

    @Override
    public Flux<Producto> productosCategoria(String categoria) {
        return catalogo()
                .filter(producto -> producto.getCategoria().equals(categoria));
    }

    @Override
    public Mono<Producto> productoCodigo(int code) {
        return null;
    }

    @Override
    public Mono<Void> altaProducto(Producto producto) {
        return null;
    }

    @Override
    public Mono<Producto> eliminarProducto(int code) {
        return null;
    }

    @Override
    public Mono<Producto> actualizarPrecio(int code, double precio) {
        return null;
    }
}
