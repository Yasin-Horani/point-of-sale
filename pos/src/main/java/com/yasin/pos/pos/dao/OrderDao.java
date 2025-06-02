package com.yasin.pos.pos.dao;

import com.yasin.pos.pos.dto.OrderDto;
import com.yasin.pos.pos.entity.OrderEntity;
import com.yasin.pos.pos.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDao {

    @Autowired
    private OrderRepo orderRepo;

    public OrderEntity saveOrder(List<OrderDto> order) {
        double totalPrice = 0.0;
        for (OrderDto orderDto : order) {
            totalPrice += orderDto.getProductPrice();
        }
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(totalPrice);
        return this.orderRepo.save(orderEntity);

    }
}
