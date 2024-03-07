package com.petblue.beans;

import com.petblue.entitys.ProductVariant;
import com.petblue.entitys.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Admin on 7/3/2024
 * @project ShopPetBlue
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDetailViewBean {
    private ProductVariant productVariant;
    private long quantity;
    private BigDecimal price;
    private BigDecimal tax;
    private BigDecimal totalMoney;
    private User userConfirm;
    private String note;
}
