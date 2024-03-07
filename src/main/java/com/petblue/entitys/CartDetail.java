// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @HoangTue
 */
@Entity
@Table(name = "cart_details")
public class CartDetail implements Serializable {
    /**
     * Primary key.
     */
    protected static final String PK = "cartDetailId";
    @Id
    @Column(name = "cart_detail_id", unique = true, nullable = false, length = 255)
    private String cartDetailId;
    @Column(nullable = false, precision = 10)
    private int quantity;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @ManyToOne(optional = false)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart carts;
    @ManyToOne(optional = false)
    @JoinColumn(name = "variant_id", nullable = false)
    private ProductVariant productVariants;


}
