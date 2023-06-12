package com.santinuin.springboot.webflux.app.models.service;

import com.santinuin.springboot.webflux.app.models.documents.Categoria;
import com.santinuin.springboot.webflux.app.models.documents.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    Flux<Producto> findAll();

    Flux<Producto> findAllConNombreUpperCase();

    Flux<Producto> findAllConNombreUpperCaseRepeat();

    Mono<Producto> findById(String id);

    Mono<Producto> save(Producto producto);

    Mono<Void> delete(Producto producto);

    Flux<Categoria> findAllCategoria();

    Mono<Categoria> findCategoriaById(String id);

    Mono<Categoria> saveCategoria(Categoria categoria);
}
