// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="product_variants")
@G9Class(tableName="product_variants", isPersistent=true)
public class ProductVariants implements Serializable {

    /** Primary key. */
    protected static final String PK = "variantId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    @G9Exclude
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="variant_id", unique=true, nullable=false, precision=19)
    @G9Attribute(isPersistent=true, precision=19, columnName="variant_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private long variantId;
    @Column(name="SKU_ID", nullable=false, length=255)
    @G9Attribute(isPersistent=true, dbLength=255, columnName="SKU_ID", isNotNull=true)
    private String skuId;
    @Column(nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", isNotNull=true)
    private int quantity;
    @Column(name="quantity_error", precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", columnName="quantity_error")
    private int quantityError;
    @Column(precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0")
    private BigDecimal tax;
    @Column(name="import_price", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="import_price")
    private BigDecimal importPrice;
    @Column(nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", isNotNull=true)
    private BigDecimal price;
    @Column(name="is_sale", precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", columnName="is_sale")
    private int isSale;
    @Column(nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", isNotNull=true)
    private int status;
    @Column(name="create_date")
    @G9Attribute(isPersistent=true, columnName="create_date")
    private LocalDateTime createDate;
    @Column(name="edit_date")
    @G9Attribute(isPersistent=true, columnName="edit_date")
    private LocalDateTime editDate;
    @OneToMany(mappedBy="productVariants")
    @G9Association(name="fk1", isPersistent=true, oppositeRole="productVariants", ownerRole="productVariants")
    private Set<VariantValues> variantValues;
    @OneToMany(mappedBy="productVariants")
    @G9Association(name="fkProductVariant", isPersistent=true, oppositeRole="productVariants", ownerRole="productVariants")
    private Set<ProductSales> productSales;
    @ManyToOne(optional=false)
    @JoinColumn(name="product_id", nullable=false)
    @G9Association(name="prodcutId", isPersistent=true, isMandatory=true, oppositeRole="productVariants", ownerRole="products", memberColumnNames="product_id", isIndexOnForeignKey=true)
    private Products products;
    @OneToMany(mappedBy="productVariants")
    @G9Association(name="productVariantId", isPersistent=true, oppositeRole="productVariants", ownerRole="productVariants")
    private Set<Images> images;
    @OneToMany(mappedBy="productVariants")
    @G9Association(name="productVariantIdx", isPersistent=true, oppositeRole="productVariants", ownerRole="productVariants")
    private Set<BillDetails> billDetails;
    @ManyToOne(optional=false)
    @JoinColumn(name="user_create", nullable=false)
    @G9Association(name="userCreate", isPersistent=true, isMandatory=true, oppositeRole="productVariants", ownerRole="users", memberColumnNames="user_create", isIndexOnForeignKey=true)
    private Users users;
    @ManyToOne(optional=false)
    @JoinColumn(name="user_edit", nullable=false)
    @G9Association(name="userEdit", isPersistent=true, isMandatory=true, oppositeRole="productVariants2", ownerRole="users2", memberColumnNames="user_edit", isIndexOnForeignKey=true)
    private Users users2;
    @OneToMany(mappedBy="productVariants")
    @G9Association(name="variantId", isPersistent=true, oppositeRole="productVariants", ownerRole="productVariants")
    private Set<CartDetails> cartDetails;

    /** Default constructor. */
    public ProductVariants() {
        super();
    }

    /**
     * Access method for variantId.
     *
     * @return the current value of variantId
     */
    public long getVariantId() {
        return variantId;
    }

    /**
     * Setter method for variantId.
     *
     * @param aVariantId the new value for variantId
     */
    public void setVariantId(long aVariantId) {
        variantId = aVariantId;
    }

    /**
     * Access method for skuId.
     *
     * @return the current value of skuId
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * Setter method for skuId.
     *
     * @param aSkuId the new value for skuId
     */
    public void setSkuId(String aSkuId) {
        skuId = aSkuId;
    }

    /**
     * Access method for quantity.
     *
     * @return the current value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for quantity.
     *
     * @param aQuantity the new value for quantity
     */
    public void setQuantity(int aQuantity) {
        quantity = aQuantity;
    }

    /**
     * Access method for quantityError.
     *
     * @return the current value of quantityError
     */
    public int getQuantityError() {
        return quantityError;
    }

    /**
     * Setter method for quantityError.
     *
     * @param aQuantityError the new value for quantityError
     */
    public void setQuantityError(int aQuantityError) {
        quantityError = aQuantityError;
    }

    /**
     * Access method for tax.
     *
     * @return the current value of tax
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Setter method for tax.
     *
     * @param aTax the new value for tax
     */
    public void setTax(BigDecimal aTax) {
        tax = aTax;
    }

    /**
     * Access method for importPrice.
     *
     * @return the current value of importPrice
     */
    public BigDecimal getImportPrice() {
        return importPrice;
    }

    /**
     * Setter method for importPrice.
     *
     * @param aImportPrice the new value for importPrice
     */
    public void setImportPrice(BigDecimal aImportPrice) {
        importPrice = aImportPrice;
    }

    /**
     * Access method for price.
     *
     * @return the current value of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param aPrice the new value for price
     */
    public void setPrice(BigDecimal aPrice) {
        price = aPrice;
    }

    /**
     * Access method for isSale.
     *
     * @return the current value of isSale
     */
    public int getIsSale() {
        return isSale;
    }

    /**
     * Setter method for isSale.
     *
     * @param aIsSale the new value for isSale
     */
    public void setIsSale(int aIsSale) {
        isSale = aIsSale;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(int aStatus) {
        status = aStatus;
    }

    /**
     * Access method for createDate.
     *
     * @return the current value of createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * Setter method for createDate.
     *
     * @param aCreateDate the new value for createDate
     */
    public void setCreateDate(LocalDateTime aCreateDate) {
        createDate = aCreateDate;
    }

    /**
     * Access method for editDate.
     *
     * @return the current value of editDate
     */
    public LocalDateTime getEditDate() {
        return editDate;
    }

    /**
     * Setter method for editDate.
     *
     * @param aEditDate the new value for editDate
     */
    public void setEditDate(LocalDateTime aEditDate) {
        editDate = aEditDate;
    }

    /**
     * Access method for variantValues.
     *
     * @return the current value of variantValues
     */
    public Set<VariantValues> getVariantValues() {
        return variantValues;
    }

    /**
     * Setter method for variantValues.
     *
     * @param aVariantValues the new value for variantValues
     */
    public void setVariantValues(Set<VariantValues> aVariantValues) {
        variantValues = aVariantValues;
    }

    /**
     * Access method for productSales.
     *
     * @return the current value of productSales
     */
    public Set<ProductSales> getProductSales() {
        return productSales;
    }

    /**
     * Setter method for productSales.
     *
     * @param aProductSales the new value for productSales
     */
    public void setProductSales(Set<ProductSales> aProductSales) {
        productSales = aProductSales;
    }

    /**
     * Access method for products.
     *
     * @return the current value of products
     */
    public Products getProducts() {
        return products;
    }

    /**
     * Setter method for products.
     *
     * @param aProducts the new value for products
     */
    public void setProducts(Products aProducts) {
        products = aProducts;
    }

    /**
     * Access method for images.
     *
     * @return the current value of images
     */
    public Set<Images> getImages() {
        return images;
    }

    /**
     * Setter method for images.
     *
     * @param aImages the new value for images
     */
    public void setImages(Set<Images> aImages) {
        images = aImages;
    }

    /**
     * Access method for billDetails.
     *
     * @return the current value of billDetails
     */
    public Set<BillDetails> getBillDetails() {
        return billDetails;
    }

    /**
     * Setter method for billDetails.
     *
     * @param aBillDetails the new value for billDetails
     */
    public void setBillDetails(Set<BillDetails> aBillDetails) {
        billDetails = aBillDetails;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Access method for users2.
     *
     * @return the current value of users2
     */
    public Users getUsers2() {
        return users2;
    }

    /**
     * Setter method for users2.
     *
     * @param aUsers2 the new value for users2
     */
    public void setUsers2(Users aUsers2) {
        users2 = aUsers2;
    }

    /**
     * Access method for cartDetails.
     *
     * @return the current value of cartDetails
     */
    public Set<CartDetails> getCartDetails() {
        return cartDetails;
    }

    /**
     * Setter method for cartDetails.
     *
     * @param aCartDetails the new value for cartDetails
     */
    public void setCartDetails(Set<CartDetails> aCartDetails) {
        cartDetails = aCartDetails;
    }

    /**
     * Compares the key for this instance with another ProductVariants.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProductVariants and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProductVariants)) {
            return false;
        }
        ProductVariants that = (ProductVariants) other;
        if (this.getVariantId() != that.getVariantId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProductVariants.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProductVariants)) return false;
        return this.equalKeys(other) && ((ProductVariants)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = (int)(getVariantId() ^ (getVariantId()>>>32));
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[ProductVariants |");
        sb.append(" variantId=").append(getVariantId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("variantId", Long.valueOf(getVariantId()));
        return ret;
    }

}
