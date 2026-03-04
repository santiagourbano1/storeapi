package com.santiago.storeapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.santiago.storeapi.Repository.ProductRepository;
import com.santiago.storeapi.entity.Product;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Crear producto
    public Product save(Product product) {
        return productRepository.save(product);
    }

    // Listar todos
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Buscar por id
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    // Eliminar
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}