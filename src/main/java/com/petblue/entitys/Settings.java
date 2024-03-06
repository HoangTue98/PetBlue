// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="settings")
@G9Class(tableName="settings", isPersistent=true)
public class Settings implements Serializable {

    /** Primary key. */
    protected static final String PK = "settingId";

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
    @Column(name="setting_id", unique=true, nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="setting_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private int settingId;
    @Column(name="user_edit", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="user_edit")
    private int userEdit;
    @Column(name="phone_shop", length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="phone_shop")
    private String phoneShop;
    @Column(length=255)
    @G9Attribute(isPersistent=true, dbLength=255)
    private String email;
    @Column(length=100)
    @G9Attribute(isPersistent=true, dbLength=100)
    private String password;
    @Column(length=255)
    @G9Attribute(isPersistent=true, dbLength=255)
    private String bank;
    @Column(name="division_id", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="division_id")
    private int divisionId;
    @Column(name="division_name", length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="division_name")
    private String divisionName;
    @Column(name="district_id", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="district_id")
    private int districtId;
    @Column(name="district_name", length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="district_name")
    private String districtName;
    @Column(name="ward_code", length=10)
    @G9Attribute(isPersistent=true, dbLength=10, columnName="ward_code")
    private String wardCode;
    @Column(name="ward_name", length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="ward_name")
    private String wardName;
    @Column(name="address_detail", length=100)
    @G9Attribute(isPersistent=true, dbLength=100, columnName="address_detail")
    private String addressDetail;
    @Column(name="update_day")
    @G9Attribute(isPersistent=true, columnName="update_day")
    private LocalDateTime updateDay;

    /** Default constructor. */
    public Settings() {
        super();
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
     * Access method for userEdit.
     *
     * @return the current value of userEdit
     */
    public int getUserEdit() {
        return userEdit;
    }

    /**
     * Setter method for userEdit.
     *
     * @param aUserEdit the new value for userEdit
     */
    public void setUserEdit(int aUserEdit) {
        userEdit = aUserEdit;
    }

    /**
     * Access method for phoneShop.
     *
     * @return the current value of phoneShop
     */
    public String getPhoneShop() {
        return phoneShop;
    }

    /**
     * Setter method for phoneShop.
     *
     * @param aPhoneShop the new value for phoneShop
     */
    public void setPhoneShop(String aPhoneShop) {
        phoneShop = aPhoneShop;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for bank.
     *
     * @return the current value of bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * Setter method for bank.
     *
     * @param aBank the new value for bank
     */
    public void setBank(String aBank) {
        bank = aBank;
    }

    /**
     * Access method for divisionId.
     *
     * @return the current value of divisionId
     */
    public int getDivisionId() {
        return divisionId;
    }

    /**
     * Setter method for divisionId.
     *
     * @param aDivisionId the new value for divisionId
     */
    public void setDivisionId(int aDivisionId) {
        divisionId = aDivisionId;
    }

    /**
     * Access method for divisionName.
     *
     * @return the current value of divisionName
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Setter method for divisionName.
     *
     * @param aDivisionName the new value for divisionName
     */
    public void setDivisionName(String aDivisionName) {
        divisionName = aDivisionName;
    }

    /**
     * Access method for districtId.
     *
     * @return the current value of districtId
     */
    public int getDistrictId() {
        return districtId;
    }

    /**
     * Setter method for districtId.
     *
     * @param aDistrictId the new value for districtId
     */
    public void setDistrictId(int aDistrictId) {
        districtId = aDistrictId;
    }

    /**
     * Access method for districtName.
     *
     * @return the current value of districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Setter method for districtName.
     *
     * @param aDistrictName the new value for districtName
     */
    public void setDistrictName(String aDistrictName) {
        districtName = aDistrictName;
    }

    /**
     * Access method for wardCode.
     *
     * @return the current value of wardCode
     */
    public String getWardCode() {
        return wardCode;
    }

    /**
     * Setter method for wardCode.
     *
     * @param aWardCode the new value for wardCode
     */
    public void setWardCode(String aWardCode) {
        wardCode = aWardCode;
    }

    /**
     * Access method for wardName.
     *
     * @return the current value of wardName
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * Setter method for wardName.
     *
     * @param aWardName the new value for wardName
     */
    public void setWardName(String aWardName) {
        wardName = aWardName;
    }

    /**
     * Access method for addressDetail.
     *
     * @return the current value of addressDetail
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * Setter method for addressDetail.
     *
     * @param aAddressDetail the new value for addressDetail
     */
    public void setAddressDetail(String aAddressDetail) {
        addressDetail = aAddressDetail;
    }

    /**
     * Access method for updateDay.
     *
     * @return the current value of updateDay
     */
    public LocalDateTime getUpdateDay() {
        return updateDay;
    }

    /**
     * Setter method for updateDay.
     *
     * @param aUpdateDay the new value for updateDay
     */
    public void setUpdateDay(LocalDateTime aUpdateDay) {
        updateDay = aUpdateDay;
    }

    /**
     * Compares the key for this instance with another Settings.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Settings and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Settings)) {
            return false;
        }
        Settings that = (Settings) other;
        if (this.getSettingId() != that.getSettingId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Settings.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Settings)) return false;
        return this.equalKeys(other) && ((Settings)other).equalKeys(this);
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
        i = getSettingId();
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
        StringBuffer sb = new StringBuffer("[Settings |");
        sb.append(" settingId=").append(getSettingId());
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
        ret.put("settingId", Integer.valueOf(getSettingId()));
        return ret;
    }

}
