package com.yasin.pos.pos.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "orders")
public class OrederEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "total")
    private Double total;
}
