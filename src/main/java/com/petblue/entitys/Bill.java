// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @HoangTue
 */
@Entity
@Table(name = "bills")
public class Bill implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "billId";

    @Id
    @Column(name = "bill_id", unique = true, nullable = false, length = 50)
    private String billId;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "total_money", precision = 10)
    private BigDecimal totalMoney;
    @Column(name = "shipping_fee", precision = 10)
    private BigDecimal shippingFee;
    @Column(precision = 10)
    private int discount;
    @Column(precision = 10)
    private int payments;
    @Column(length = 20)
    private String phone;
    @Column(length = 100)
    private String note;
    @Column(name = "bill_type", precision = 10)
    private int billType;
    @Column(name = "division_id", precision = 10)
    private int divisionId;
    @Column(name = "division_name", length = 100)
    private String divisionName;
    @Column(name = "district_id", precision = 10)
    private int districtId;
    @Column(name = "district_name", length = 100)
    private String districtName;
    @Column(name = "ward_id", precision = 10)
    private int wardId;
    @Column(name = "ward_name", length = 100)
    private String wardName;
    @Column(name = "ward_code", length = 100)
    private String wardCode;
    @Column(name = "address_detail", length = 255)
    private String addressDetail;
    @Column(name = "success_date")
    private LocalDate successDate;
    @Column(precision = 10)
    private int status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User users;
    @OneToMany(mappedBy = "bills")
    private Set<BillDetail> billDetails;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users2;
}
