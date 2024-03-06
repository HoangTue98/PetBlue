package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.math.BigDecimal;


@Entity(name="bill_details")
public class BillDetails implements Serializable {

    /** Primary key. */

    @Id
    @Column(name="detail_bill_id", unique=true, nullable=false, length=255)
    private String detailBillId;
    @Column(precision=10)
    private int quantity;
    @Column(precision=10)
    private BigDecimal price;
    @Column(precision=10)
    private BigDecimal tax;
    @Column(name="total_money", precision=10)
    private BigDecimal totalMoney;
    @Column(length=255)
    private String note;
    @Column(precision=10)
    private int status;
    @Column(name="bill_detail_id_parent", length=255)
    private String billDetailIdParent;
    @Column(name="user_confirm", precision=10)
    private int userConfirm;
    @ManyToOne(optional=false)
    @JoinColumn(name="bill_id", nullable=false)
    private Bills bills;
    @ManyToOne
    @JoinColumn(name="variant_id")
    private ProductVariants productVariants;
}
