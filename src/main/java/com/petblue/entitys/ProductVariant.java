// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @HoangTue
 */
@Entity
@Table(name = "product_variants")
public class ProductVariant implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "variantId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "variant_id", unique = true, nullable = false, precision = 19)
    private long variantId;
    @Column(name = "SKU_ID", nullable = false, length = 255)
    private String skuId;
    @Column(nullable = false, precision = 10)
    private int quantity;
    @Column(name = "quantity_error", precision = 10)
    private int quantityError;
    @Column(precision = 10)
    private BigDecimal tax;
    @Column(name = "import_price", precision = 10)
    private BigDecimal importPrice;
    @Column(nullable = false, precision = 10)
    private BigDecimal price;
    @Column(name = "is_sale", precision = 10)
    private int isSale;
    @Column(nullable = false, precision = 10)
    private int status;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @Column(name = "edit_date")
    private LocalDateTime editDate;
    @OneToMany(mappedBy = "productVariants")
    private Set<VariantValue> variantValues;
    @OneToMany(mappedBy = "productVariants")
    private Set<ProductSale> productSales;
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product products;
    @OneToMany(mappedBy = "productVariants")
    private Set<Image> images;
    @OneToMany(mappedBy = "productVariants")
    private Set<BillDetail> billDetails;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_create", nullable = false)
    private User users;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_edit", nullable = false)
    private User users2;
    @OneToMany(mappedBy = "productVariants")
    private Set<CartDetail> cartDetails;


}
