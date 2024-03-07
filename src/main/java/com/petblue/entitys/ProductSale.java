// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;

/**
 * @HoangTue
 */
@Entity
@Table(name = "product_sales")
public class ProductSale implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "productSaleId";

    @Id
    @Column(name = "product_sale_id", unique = true, nullable = false, length = 50)
    private String productSaleId;
    @Column(precision = 10)
    private int status;
    @ManyToOne(optional = false)
    @JoinColumn(name = "variant_id", nullable = false)
    private ProductVariant productVariants;
    @ManyToOne(optional = false)
    @JoinColumn(name = "sale_id", nullable = false)
    private Sale sales;


}
