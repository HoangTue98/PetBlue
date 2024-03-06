// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="history")
@G9Class(tableName="history", isPersistent=true)
public class History implements Serializable {

    /** Primary key. */
    protected static final String PK = "historyId";

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
    @Column(name="history_id", unique=true, nullable=false, length=50)
    @G9Attribute(isPersistent=true, dbLength=50, columnName="history_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private String historyId;
    @Column(name="setting_id", nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="setting_id", isNotNull=true)
    private int settingId;
    @Column(name="created_date", nullable=false)
    @G9Attribute(isPersistent=true, columnName="created_date", isNotNull=true)
    private LocalDateTime createdDate;
    @Column(nullable=false, length=1000)
    @G9Attribute(isPersistent=true, dbLength=1000, isNotNull=true)
    private String description;

    /** Default constructor. */
    public History() {
        super();
    }

    /**
     * Access method for historyId.
     *
     * @return the current value of historyId
     */
    public String getHistoryId() {
        return historyId;
    }

    /**
     * Setter method for historyId.
     *
     * @param aHistoryId the new value for historyId
     */
    public void setHistoryId(String aHistoryId) {
        historyId = aHistoryId;
    }

    /**
     * Access method for settingId.
     *
     * @return the current value of settingId
     */
    public int getSettingId() {
        return settingId;
    }

    /**
     * Setter method for settingId.
     *
     * @param aSettingId the new value for settingId
     */
    public void setSettingId(int aSettingId) {
        settingId = aSettingId;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(LocalDateTime aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Compares the key for this instance with another History.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class History and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof History)) {
            return false;
        }
        History that = (History) other;
        Object myHistoryId = this.getHistoryId();
        Object yourHistoryId = that.getHistoryId();
        if (myHistoryId==null ? yourHistoryId!=null : !myHistoryId.equals(yourHistoryId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another History.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof History)) return false;
        return this.equalKeys(other) && ((History)other).equalKeys(this);
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
        if (getHistoryId() == null) {
            i = 0;
        } else {
            i = getHistoryId().hashCode();
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
        StringBuffer sb = new StringBuffer("[History |");
        sb.append(" historyId=").append(getHistoryId());
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
        ret.put("historyId", getHistoryId());
        return ret;
    }

}
