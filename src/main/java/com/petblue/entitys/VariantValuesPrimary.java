
package com.petblue.entitys;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class VariantValuesPrimary implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "Option_id", nullable = false),
            @JoinColumn(name = "Product_id", nullable = false)
    })
    private ProductOption productOptions;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "variant_id", nullable = false)
    private ProductVariant productVariants;

    /**
     * @return
     */
    public ProductOption getProductOptions() {
        return productOptions;
    }

    /**
     * @param productOptions
     */
    public void setProductOptions(ProductOption productOptions) {
        this.productOptions = productOptions;
    }

    /**
     *
     * @return
     */
    public ProductVariant getProductVariants() {
        return productVariants;
    }

    /**
     *
     * @param productVariants
     */
    public void setProductVariants(ProductVariant productVariants) {
        this.productVariants = productVariants;
    }

}
