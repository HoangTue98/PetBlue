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

@Entity(name="variant_values")
@IdClass(VariantValues.VariantValuesId.class)
@G9Class(tableName="variant_values", isPersistent=true)
public class VariantValues implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class VariantValuesId implements Serializable {
        ProductVariants productVariants;
        int productId;
        int optionId;
    }

    /** Primary key. */
    protected static final String PK = "VariantValuesPrimary";

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
    @Column(name="Product_id", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="Product_id", isNotNull=true)
    private int productId;
    @Id
    @Column(name="Option_id", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="Option_id", isNotNull=true)
    private int optionId;
    @Column(name="Status", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="Status", isNotNull=true)
    private int status;
    @G9Attribute(isPrimaryKey=true, isUnique=true, isIndex=true)
    private VariantValuesPrimary variantValuesPrimary;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="Variant_id", nullable=false)
    @G9Association(name="fk1", isPersistent=true, isMandatory=true, oppositeRole="variantValues", ownerRole="productVariants", memberColumnNames="Variant_id")
    private ProductVariants productVariants;
    @ManyToOne(optional=false)
    @JoinColumn(name="Value_id", nullable=false)
    @G9Association(name="optionValueValueId", isPersistent=true, isMandatory=true, oppositeRole="variantValues", ownerRole="optionValues", memberColumnNames="Value_id", isIndexOnForeignKey=true)
    private OptionValues optionValues;

    /** Default constructor. */
    public VariantValues() {
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
     * Access method for optionId.
     *
     * @return the current value of optionId
     */
    public int getOptionId() {
        return optionId;
    }

    /**
     * Setter method for optionId.
     *
     * @param aOptionId the new value for optionId
     */
    public void setOptionId(int aOptionId) {
        optionId = aOptionId;
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
     * Access method for optionValues.
     *
     * @return the current value of optionValues
     */
    public OptionValues getOptionValues() {
        return optionValues;
    }

    /**
     * Setter method for optionValues.
     *
     * @param aOptionValues the new value for optionValues
     */
    public void setOptionValues(OptionValues aOptionValues) {
        optionValues = aOptionValues;
    }

    /** Temporary value holder for group key fragment productVariantsVariantId */
    @G9Exclude
    private transient long tempProductVariantsVariantId;

    /**
     * Gets the key fragment variantId for member productVariants.
     * If this.productVariants is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setProductVariantsVariantId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see ProductVariants
     */
    @G9Exclude
    public long getProductVariantsVariantId() {
        return (getProductVariants() == null ? tempProductVariantsVariantId : getProductVariants().getVariantId());
    }

    /**
     * Sets the key fragment variantId from member productVariants.
     * If this.productVariants is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getProductVariantsVariantId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aVariantId New value for the key fragment
     * @see ProductVariants
     */
    public void setProductVariantsVariantId(long aVariantId) {
        if (getProductVariants() == null) {
            tempProductVariantsVariantId = aVariantId;
        } else {
            getProductVariants().setVariantId(aVariantId);
        }
    }

    /**
     * Compares the key for this instance with another VariantValues.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VariantValues and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VariantValues)) {
            return false;
        }
        VariantValues that = (VariantValues) other;
        if (this.getProductVariantsVariantId() != that.getProductVariantsVariantId()) {
            return false;
        }
        if (this.getProductId() != that.getProductId()) {
            return false;
        }
        if (this.getOptionId() != that.getOptionId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VariantValues.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VariantValues)) return false;
        return this.equalKeys(other) && ((VariantValues)other).equalKeys(this);
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
        i = (int)(getProductVariantsVariantId() ^ (getProductVariantsVariantId()>>>32));
        result = 37*result + i;
        i = getProductId();
        result = 37*result + i;
        i = getOptionId();
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
        StringBuffer sb = new StringBuffer("[VariantValues |");
        sb.append(" productVariantsVariantId=").append(getProductVariantsVariantId());
        sb.append(" productId=").append(getProductId());
        sb.append(" optionId=").append(getOptionId());
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
        ret.put("productVariantsVariantId", Long.valueOf(getProductVariantsVariantId()));
        ret.put("productId", Integer.valueOf(getProductId()));
        ret.put("optionId", Integer.valueOf(getOptionId()));
        return ret;
    }

}
