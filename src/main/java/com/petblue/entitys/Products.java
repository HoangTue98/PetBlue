// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="products")
@G9Class(tableName="products", isPersistent=true)
public class Products implements Serializable {

    /** Primary key. */
    protected static final String PK = "productId";

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
    @Column(name="Product_id", unique=true, nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="Product_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private int productId;
    @Column(name="Product_name", nullable=false, length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="Product_name", isNotNull=true)
    private String productName;
    @Column(name="Status", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="Status", isNotNull=true)
    private int status;
    @OneToMany(mappedBy="products")
    @G9Association(name="prodcutId", isPersistent=true, oppositeRole="products", ownerRole="products")
    private Set<ProductVariants> productVariants;
    @OneToMany(mappedBy="products")
    @G9Association(name="productId", isPersistent=true, oppositeRole="products", ownerRole="products")
    private Set<ProductOptions> productOptions;

    /** Default constructor. */
    public Products() {
        super();
    }

    /**
     * Access method for productId.
     *
     * @return the current value of productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Setter method for productId.
     *
     * @param aProductId the new value for productId
     */
    public void setProductId(int aProductId) {
        productId = aProductId;
    }

    /**
     * Access method for productName.
     *
     * @return the current value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Setter method for productName.
     *
     * @param aProductName the new value for productName
     */
    public void setProductName(String aProductName) {
        productName = aProductName;
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
    public Set<ProductVariants> getProductVariants() {
        return productVariants;
    }

    /**
     * Setter method for productVariants.
     *
     * @param aProductVariants the new value for productVariants
     */
    public void setProductVariants(Set<ProductVariants> aProductVariants) {
        productVariants = aProductVariants;
    }

    /**
     * Access method for productOptions.
     *
     * @return the current value of productOptions
     */
    public Set<ProductOptions> getProductOptions() {
        return productOptions;
    }

    /**
     * Setter method for productOptions.
     *
     * @param aProductOptions the new value for productOptions
     */
    public void setProductOptions(Set<ProductOptions> aProductOptions) {
        productOptions = aProductOptions;
    }

    /**
     * Compares the key for this instance with another Products.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Products and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Products)) {
            return false;
        }
        Products that = (Products) other;
        if (this.getProductId() != that.getProductId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Products.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Products)) return false;
        return this.equalKeys(other) && ((Products)other).equalKeys(this);
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
        i = getProductId();
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
        StringBuffer sb = new StringBuffer("[Products |");
        sb.append(" productId=").append(getProductId());
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
        ret.put("productId", Integer.valueOf(getProductId()));
        return ret;
    }

}
