// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="product_sales")
@G9Class(tableName="product_sales", isPersistent=true)
public class ProductSales implements Serializable {

    /** Primary key. */
    protected static final String PK = "productSaleId";

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
    @Column(name="product_sale_id", unique=true, nullable=false, length=50)
    @G9Attribute(isPersistent=true, dbLength=50, columnName="product_sale_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private String productSaleId;
    @Column(precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1")
    private int status;
    @ManyToOne(optional=false)
    @JoinColumn(name="variant_id", nullable=false)
    @G9Association(name="fkProductVariant", isPersistent=true, isMandatory=true, oppositeRole="productSales", ownerRole="productVariants", memberColumnNames="variant_id", isIndexOnForeignKey=true)
    private ProductVariants productVariants;
    @ManyToOne(optional=false)
    @JoinColumn(name="sale_id", nullable=false)
    @G9Association(name="fkSale", isPersistent=true, isMandatory=true, oppositeRole="productSales", ownerRole="sales", memberColumnNames="sale_id", isIndexOnForeignKey=true)
    private Sales sales;

    /** Default constructor. */
    public ProductSales() {
        super();
    }

    /**
     * Access method for productSaleId.
     *
     * @return the current value of productSaleId
     */
    public String getProductSaleId() {
        return productSaleId;
    }

    /**
     * Setter method for productSaleId.
     *
     * @param aProductSaleId the new value for productSaleId
     */
    public void setProductSaleId(String aProductSaleId) {
        productSaleId = aProductSaleId;
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
     * Access method for productVariants.
     *
     * @return the current value of productVariants
     */
    public ProductVariants getProductVariants() {
        return productVariants;
    }

    /**
     * Setter method for productVariants.
     *
     * @param aProductVariants the new value for productVariants
     */
    public void setProductVariants(ProductVariants aProductVariants) {
        productVariants = aProductVariants;
    }

    /**
     * Access method for sales.
     *
     * @return the current value of sales
     */
    public Sales getSales() {
        return sales;
    }

    /**
     * Setter method for sales.
     *
     * @param aSales the new value for sales
     */
    public void setSales(Sales aSales) {
        sales = aSales;
    }

    /**
     * Compares the key for this instance with another ProductSales.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProductSales and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProductSales)) {
            return false;
        }
        ProductSales that = (ProductSales) other;
        Object myProductSaleId = this.getProductSaleId();
        Object yourProductSaleId = that.getProductSaleId();
        if (myProductSaleId==null ? yourProductSaleId!=null : !myProductSaleId.equals(yourProductSaleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProductSales.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProductSales)) return false;
        return this.equalKeys(other) && ((ProductSales)other).equalKeys(this);
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
        if (getProductSaleId() == null) {
            i = 0;
        } else {
            i = getProductSaleId().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[ProductSales |");
        sb.append(" productSaleId=").append(getProductSaleId());
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
        ret.put("productSaleId", getProductSaleId());
        return ret;
    }

}
