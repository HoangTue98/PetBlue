// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="product_options")
@IdClass(ProductOptions.ProductOptionsId.class)
@G9Class(tableName="product_options", isPersistent=true)
public class ProductOptions implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class ProductOptionsId implements Serializable {
        Products products;
        Options options;
    }

    /** Primary key. */
    protected static final String PK = "ProductOptionsPrimary";

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

    @Column(name="Status", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="Status", isNotNull=true)
    private int status;
    @G9Attribute(isPrimaryKey=true, isUnique=true, isIndex=true)
    private ProductOptionsPrimary productOptionsPrimary;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="Option_id", nullable=false)
    @G9Association(name="optionId", isPersistent=true, isMandatory=true, oppositeRole="productOptions", ownerRole="options", memberColumnNames="Option_id", isIndexOnForeignKey=true)
    private Options options;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="Product_id", nullable=false)
    @G9Association(name="productId", isPersistent=true, isMandatory=true, oppositeRole="productOptions", ownerRole="products", memberColumnNames="Product_id")
    private Products products;

    /** Default constructor. */
    public ProductOptions() {
        super();
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
     * Access method for options.
     *
     * @return the current value of options
     */
    public Options getOptions() {
        return options;
    }

    /**
     * Setter method for options.
     *
     * @param aOptions the new value for options
     */
    public void setOptions(Options aOptions) {
        options = aOptions;
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

    /** Temporary value holder for group key fragment productsProductId */
    @G9Exclude
    private transient int tempProductsProductId;

    /**
     * Gets the key fragment productId for member products.
     * If this.products is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setProductsProductId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Products
     */
    @G9Exclude
    public int getProductsProductId() {
        return (getProducts() == null ? tempProductsProductId : getProducts().getProductId());
    }

    /**
     * Sets the key fragment productId from member products.
     * If this.products is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getProductsProductId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aProductId New value for the key fragment
     * @see Products
     */
    public void setProductsProductId(int aProductId) {
        if (getProducts() == null) {
            tempProductsProductId = aProductId;
        } else {
            getProducts().setProductId(aProductId);
        }
    }

    /** Temporary value holder for group key fragment optionsOptionId */
    @G9Exclude
    private transient int tempOptionsOptionId;

    /**
     * Gets the key fragment optionId for member options.
     * If this.options is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setOptionsOptionId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Options
     */
    @G9Exclude
    public int getOptionsOptionId() {
        return (getOptions() == null ? tempOptionsOptionId : getOptions().getOptionId());
    }

    /**
     * Sets the key fragment optionId from member options.
     * If this.options is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getOptionsOptionId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aOptionId New value for the key fragment
     * @see Options
     */
    public void setOptionsOptionId(int aOptionId) {
        if (getOptions() == null) {
            tempOptionsOptionId = aOptionId;
        } else {
            getOptions().setOptionId(aOptionId);
        }
    }

    /**
     * Compares the key for this instance with another ProductOptions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProductOptions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProductOptions)) {
            return false;
        }
        ProductOptions that = (ProductOptions) other;
        if (this.getProductsProductId() != that.getProductsProductId()) {
            return false;
        }
        if (this.getOptionsOptionId() != that.getOptionsOptionId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProductOptions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProductOptions)) return false;
        return this.equalKeys(other) && ((ProductOptions)other).equalKeys(this);
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
        i = getProductsProductId();
        result = 37*result + i;
        i = getOptionsOptionId();
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
        StringBuffer sb = new StringBuffer("[ProductOptions |");
        sb.append(" productsProductId=").append(getProductsProductId());
        sb.append(" optionsOptionId=").append(getOptionsOptionId());
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
        ret.put("productsProductId", Integer.valueOf(getProductsProductId()));
        ret.put("optionsOptionId", Integer.valueOf(getOptionsOptionId()));
        return ret;
    }

}
