/**
 * DATN_FALL2022, 2022
 * BillDetailViewBean.java, BUI_QUANG_HIEU
 */
package com.petblue.beans;

import com.petblue.entitys.BillDetail;
import com.petblue.entitys.ProductVariant;
import com.petblue.entitys.User;
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
public class BillDetailReturnCustomerViewBean {
	private ProductVariant productVariant;
	private long quantity;
	private BigDecimal price;
	private BigDecimal tax;
	private BigDecimal totalMoney;
	private User userConfirm;
	private String note;
	private BillDetail billDetailParent;
}
