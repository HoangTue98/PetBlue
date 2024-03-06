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

@Entity(name="options")
@G9Class(tableName="options", isPersistent=true)
public class Options implements Serializable {

    /** Primary key. */
    protected static final String PK = "optionId";

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
    @Column(name="Option_id", unique=true, nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="Option_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private int optionId;
    @Column(name="Option_name", nullable=false, length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="Option_name", isNotNull=true)
    private String optionName;
    @Column(name="Status", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="Status", isNotNull=true)
    private int status;
    @Column(name="is_show", precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="is_show")
    private int isShow;
    @OneToMany(mappedBy="options")
    @G9Association(name="optionId", isPersistent=true, oppositeRole="options", ownerRole="options")
    private Set<ProductOptions> productOptions;
    @OneToMany(mappedBy="options")
    @G9Association(name="optionOptionId", isPersistent=true, oppositeRole="options", ownerRole="options")
    private Set<OptionValues> optionValues;

    /** Default constructor. */
    public Options() {
        super();
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
     * Access method for optionName.
     *
     * @return the current value of optionName
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * Setter method for optionName.
     *
     * @param aOptionName the new value for optionName
     */
    public void setOptionName(String aOptionName) {
        optionName = aOptionName;
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
     * Access method for isShow.
     *
     * @return the current value of isShow
     */
    public int getIsShow() {
        return isShow;
    }

    /**
     * Setter method for isShow.
     *
     * @param aIsShow the new value for isShow
     */
    public void setIsShow(int aIsShow) {
        isShow = aIsShow;
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
     * Access method for optionValues.
     *
     * @return the current value of optionValues
     */
    public Set<OptionValues> getOptionValues() {
        return optionValues;
    }

    /**
     * Setter method for optionValues.
     *
     * @param aOptionValues the new value for optionValues
     */
    public void setOptionValues(Set<OptionValues> aOptionValues) {
        optionValues = aOptionValues;
    }

    /**
     * Compares the key for this instance with another Options.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Options and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Options)) {
            return false;
        }
        Options that = (Options) other;
        if (this.getOptionId() != that.getOptionId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Options.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Options)) return false;
        return this.equalKeys(other) && ((Options)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Options |");
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
        ret.put("optionId", Integer.valueOf(getOptionId()));
        return ret;
    }

}
