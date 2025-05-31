package com.yasin.pos.pos.repository;

import com.yasin.pos.pos.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findByProductBarcode(String barcode);

    ProductEntity findByProductId(Integer productId);
}
