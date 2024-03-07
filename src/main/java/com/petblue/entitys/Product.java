// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Set;


/**
 * @HoangTue
 */
@Entity
@Table(name = "products")
public class Product implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "productId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_id", unique = true, nullable = false, precision = 10)
    private int productId;
    @Column(name = "Product_name", nullable = false, length = 100)
    private String productName;
    @Column(name = "Status", nullable = false, precision = 10)
    private int status;
    @OneToMany(mappedBy = "products")
    private Set<ProductVariant> productVariants;
    @OneToMany(mappedBy = "products")
    private Set<ProductOption> productOptions;


}
