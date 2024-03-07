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
@Table(name = "product_options")
public class ProductOption implements Serializable {


    /**
     * Primary key.
     */
    protected static final String PK = "ProductOptionsPrimary";

    @Column(name = "Status", nullable = false, precision = 10)
    private int status;
    private ProductOptionsPrimary productOptionsPrimary;
    @ManyToOne(optional = false)
    @Id
    @JoinColumn(name = "Option_id", nullable = false)
    private Option options;
    @ManyToOne(optional = false)
    @Id
    @JoinColumn(name = "Product_id", nullable = false)
    private Product products;

}
