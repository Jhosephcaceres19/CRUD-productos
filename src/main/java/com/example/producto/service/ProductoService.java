package com.example.producto.service;

import java.util.List;

import com.example.producto.dto.ProductoDTO;

public interface ProductoService {
    ProductoDTO crearProducto(ProductoDTO productoDTO);
    ProductoDTO obtenerProductoPorId(Long id);
    List<ProductoDTO> obtenerTodosProductos();
    void eliminarProducto(Long id);
}
