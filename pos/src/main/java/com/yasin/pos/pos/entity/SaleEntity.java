package com.yasin.pos.pos.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "sales")
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Integer saleId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orederId;

    @Column(name = "created_at")
    private String createdAt;

}

