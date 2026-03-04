package com.santiago.storeapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiago.storeapi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}