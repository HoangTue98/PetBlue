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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;


@Entity
@Table(name = "sales")
public class Sale implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "saleId";
    @Id
    @Column(name = "sale_id", unique = true, nullable = false, length = 255)
    private String saleId;
    @Column(name = "sale_name", length = 255)
    private String saleName;
    @Column(name = "discount_type", precision = 10)
    private int discountType;
    @Column(precision = 10)
    private BigDecimal discount;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(precision = 10)
    private int status;
    @Column(precision = 10)
    private int weekday;
    @Column(name = "start_at")
    private LocalTime startAt;
    @Column(name = "end_at")
    private LocalTime endAt;
    @Column(name = "sale_type", precision = 10)
    private int saleType;
    @Column(name = "created_user", precision = 10)
    private int createdUser;
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
    @Column(name = "updated_user", precision = 10)
    private int updatedUser;
    @OneToMany(mappedBy = "sales")
    private Set<ProductSale> productSales;
    @OneToMany(mappedBy = "sales")
    private Set<Sale> salesM;
    @ManyToOne
    @JoinColumn(name = "sale_parent")
    private Sale sales;
}
