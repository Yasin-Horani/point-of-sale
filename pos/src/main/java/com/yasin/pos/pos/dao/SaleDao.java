package com.yasin.pos.pos.dao;


import com.yasin.pos.pos.dto.OrderDto;
import com.yasin.pos.pos.entity.OrderEntity;
import com.yasin.pos.pos.entity.SaleEntity;
import com.yasin.pos.pos.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleDao {

    @Autowired
    private SaleRepo saleRepo;

    private OrderDao orderDao;

    public SaleDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public OrderEntity savaSale(List<OrderDto> order) {
        if (order.isEmpty()) {
            return null;
        }
        OrderEntity orderEntity = this.orderDao.saveOrder(order);
        for (OrderDto orderDto : order) {
            SaleEntity sale = new SaleEntity();
            sale.setOrederId(orderEntity.getOrderId());
            sale.setProductId(orderDto.getProductId());
            this.saleRepo.save(sale);
        }
        return orderEntity;
    }
}
