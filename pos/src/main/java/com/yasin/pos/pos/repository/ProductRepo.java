package com.yasin.pos.pos.repository;

import com.yasin.pos.pos.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
