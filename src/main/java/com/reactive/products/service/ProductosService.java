package com.reactive.products.service;


import com.reactive.products.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ProductosService {
    Flux<Producto> catalogo();
    Flux<Producto> productosCategoria(String categoria);
    Mono<Producto> productoCodigo(int code);
    Mono<Void> altaProducto(Producto producto);
    Mono<Producto> eliminarProducto(int code);
    Mono<Producto> actualizarPrecio(int code, double precio);
}
