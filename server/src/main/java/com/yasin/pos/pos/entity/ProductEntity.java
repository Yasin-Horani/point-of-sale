package com.yasin.pos.pos.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "barcode")
    private String productBarcode;



    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private List<SaleEntity> sales;

}
