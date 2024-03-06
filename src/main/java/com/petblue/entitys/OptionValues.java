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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="option_values")
@G9Class(tableName="option_values", isPersistent=true)
public class OptionValues implements Serializable {

    /** Primary key. */
    protected static final String PK = "valueId";

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
    @Column(name="Value_id", unique=true, nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="Value_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private int valueId;
    @Column(name="Value_name", nullable=false, length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="Value_name", isNotNull=true)
    private String valueName;
    @Column(name="Status", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="Status", isNotNull=true)
    private int status;
    @Column(name="is_show", precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", columnName="is_show")
    private int isShow;
    @ManyToOne(optional=false)
    @JoinColumn(name="Option_id", nullable=false)
    @G9Association(name="optionOptionId", isPersistent=true, isMandatory=true, oppositeRole="optionValues", ownerRole="options", memberColumnNames="Option_id", isIndexOnForeignKey=true)
    private Options options;
    @OneToMany(mappedBy="optionValues")
    @G9Association(name="optionValueValueId", isPersistent=true, oppositeRole="optionValues", ownerRole="optionValues")
    private Set<VariantValues> variantValues;

    /** Default constructor. */
    public OptionValues() {
        super();
    }

    /**
     * Access method for valueId.
     *
     * @return the current value of valueId
     */
    public int getValueId() {
        return valueId;
    }

    /**
     * Setter method for valueId.
     *
     * @param aValueId the new value for valueId
     */
    public void setValueId(int aValueId) {
        valueId = aValueId;
    }

    /**
     * Access method for valueName.
     *
     * @return the current value of valueName
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * Setter method for valueName.
     *
     * @param aValueName the new value for valueName
     */
    public void setValueName(String aValueName) {
        valueName = aValueName;
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
     * Compares the key for this instance with another OptionValues.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OptionValues and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OptionValues)) {
            return false;
        }
        OptionValues that = (OptionValues) other;
        if (this.getValueId() != that.getValueId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OptionValues.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OptionValues)) return false;
        return this.equalKeys(other) && ((OptionValues)other).equalKeys(this);
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
        i = getValueId();
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
        StringBuffer sb = new StringBuffer("[OptionValues |");
        sb.append(" valueId=").append(getValueId());
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
        ret.put("valueId", Integer.valueOf(getValueId()));
        return ret;
    }

}
