package com.yasin.pos.pos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Integer orderId;

    @Column(name = "created_at")
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    @JsonManagedReference
    private ProductEntity product;


}

