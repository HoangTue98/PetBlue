// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @HoangTue
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOptionsPrimary {

    @ManyToOne(optional = false)
    @JoinColumn(name = "Product_id", nullable = false)
    private Product products;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Option_id", nullable = false)
    private Option options;

}
