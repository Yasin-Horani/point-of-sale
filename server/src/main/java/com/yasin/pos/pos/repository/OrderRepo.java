package com.yasin.pos.pos.repository;

import com.yasin.pos.pos.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

}
