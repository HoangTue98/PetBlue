// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "variant_values")
public class VariantValue implements Serializable {
    /**
     * Primary key.
     */
    protected static final String PK = "VariantValuesPrimary";
    @Id
    @Column(name = "Product_id", nullable = false, precision = 10)
    private int productId;
    @Id
    @Column(name = "Option_id", nullable = false, precision = 10)
    private int optionId;
    @Column(name = "Status", nullable = false, precision = 10)
    private int status;
    private VariantValuesPrimary variantValuesPrimary;
    @ManyToOne(optional = false)
    @Id
    @JoinColumn(name = "Variant_id", nullable = false)
    private ProductVariant productVariants;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Value_id", nullable = false)
    private OptionValue optionValue;

}
