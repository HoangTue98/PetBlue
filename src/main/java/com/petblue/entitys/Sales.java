// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="sales")
@G9Class(tableName="sales", isPersistent=true)
public class Sales implements Serializable {

    /** Primary key. */
    protected static final String PK = "saleId";

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
    @Column(name="sale_id", unique=true, nullable=false, length=255)
    @G9Attribute(isPersistent=true, dbLength=255, columnName="sale_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private String saleId;
    @Column(name="sale_name", length=255)
    @G9Attribute(isPersistent=true, dbLength=255, columnName="sale_name")
    private String saleName;
    @Column(name="discount_type", precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", columnName="discount_type")
    private int discountType;
    @Column(precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0")
    private BigDecimal discount;
    @Column(name="created_date")
    @G9Attribute(isPersistent=true, columnName="created_date")
    private LocalDateTime createdDate;
    @Column(name="start_date")
    @G9Attribute(isPersistent=true, columnName="start_date")
    private LocalDateTime startDate;
    @Column(name="end_date")
    @G9Attribute(isPersistent=true, columnName="end_date")
    private LocalDateTime endDate;
    @Column(precision=10)
    @G9Attribute(isPersistent=true, precision=10)
    private int status;
    @Column(precision=10)
    @G9Attribute(isPersistent=true, precision=10)
    private int weekday;
    @Column(name="start_at")
    @G9Attribute(isPersistent=true, columnName="start_at")
    private LocalTime startAt;
    @Column(name="end_at")
    @G9Attribute(isPersistent=true, columnName="end_at")
    private LocalTime endAt;
    @Column(name="sale_type", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="sale_type")
    private int saleType;
    @Column(name="created_user", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="created_user")
    private int createdUser;
    @Column(name="updated_date")
    @G9Attribute(isPersistent=true, columnName="updated_date")
    private LocalDateTime updatedDate;
    @Column(name="updated_user", precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="updated_user")
    private int updatedUser;
    @OneToMany(mappedBy="sales")
    @G9Association(name="fkSale", isPersistent=true, oppositeRole="sales", ownerRole="sales")
    private Set<ProductSales> productSales;
    @OneToMany(mappedBy="sales")
    @G9Association(name="fkSaleIdSaleParent", isPersistent=true, oppositeRole="sales", ownerRole="sales")
    private Set<Sales> salesM;
    @ManyToOne
    @JoinColumn(name="sale_parent")
    @G9Association(name="fkSaleIdSaleParent", isPersistent=true, oppositeRole="salesM", ownerRole="sales", memberColumnNames="sale_parent", isIndexOnForeignKey=true)
    private Sales sales;

    /** Default constructor. */
    public Sales() {
        super();
    }

    /**
     * Access method for saleId.
     *
     * @return the current value of saleId
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Setter method for saleId.
     *
     * @param aSaleId the new value for saleId
     */
    public void setSaleId(String aSaleId) {
        saleId = aSaleId;
    }

    /**
     * Access method for saleName.
     *
     * @return the current value of saleName
     */
    public String getSaleName() {
        return saleName;
    }

    /**
     * Setter method for saleName.
     *
     * @param aSaleName the new value for saleName
     */
    public void setSaleName(String aSaleName) {
        saleName = aSaleName;
    }

    /**
     * Access method for discountType.
     *
     * @return the current value of discountType
     */
    public int getDiscountType() {
        return discountType;
    }

    /**
     * Setter method for discountType.
     *
     * @param aDiscountType the new value for discountType
     */
    public void setDiscountType(int aDiscountType) {
        discountType = aDiscountType;
    }

    /**
     * Access method for discount.
     *
     * @return the current value of discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Setter method for discount.
     *
     * @param aDiscount the new value for discount
     */
    public void setDiscount(BigDecimal aDiscount) {
        discount = aDiscount;
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
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(LocalDateTime aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(LocalDateTime aEndDate) {
        endDate = aEndDate;
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
     * Access method for weekday.
     *
     * @return the current value of weekday
     */
    public int getWeekday() {
        return weekday;
    }

    /**
     * Setter method for weekday.
     *
     * @param aWeekday the new value for weekday
     */
    public void setWeekday(int aWeekday) {
        weekday = aWeekday;
    }

    /**
     * Access method for startAt.
     *
     * @return the current value of startAt
     */
    public LocalTime getStartAt() {
        return startAt;
    }

    /**
     * Setter method for startAt.
     *
     * @param aStartAt the new value for startAt
     */
    public void setStartAt(LocalTime aStartAt) {
        startAt = aStartAt;
    }

    /**
     * Access method for endAt.
     *
     * @return the current value of endAt
     */
    public LocalTime getEndAt() {
        return endAt;
    }

    /**
     * Setter method for endAt.
     *
     * @param aEndAt the new value for endAt
     */
    public void setEndAt(LocalTime aEndAt) {
        endAt = aEndAt;
    }

    /**
     * Access method for saleType.
     *
     * @return the current value of saleType
     */
    public int getSaleType() {
        return saleType;
    }

    /**
     * Setter method for saleType.
     *
     * @param aSaleType the new value for saleType
     */
    public void setSaleType(int aSaleType) {
        saleType = aSaleType;
    }

    /**
     * Access method for createdUser.
     *
     * @return the current value of createdUser
     */
    public int getCreatedUser() {
        return createdUser;
    }

    /**
     * Setter method for createdUser.
     *
     * @param aCreatedUser the new value for createdUser
     */
    public void setCreatedUser(int aCreatedUser) {
        createdUser = aCreatedUser;
    }

    /**
     * Access method for updatedDate.
     *
     * @return the current value of updatedDate
     */
    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter method for updatedDate.
     *
     * @param aUpdatedDate the new value for updatedDate
     */
    public void setUpdatedDate(LocalDateTime aUpdatedDate) {
        updatedDate = aUpdatedDate;
    }

    /**
     * Access method for updatedUser.
     *
     * @return the current value of updatedUser
     */
    public int getUpdatedUser() {
        return updatedUser;
    }

    /**
     * Setter method for updatedUser.
     *
     * @param aUpdatedUser the new value for updatedUser
     */
    public void setUpdatedUser(int aUpdatedUser) {
        updatedUser = aUpdatedUser;
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
     * Access method for salesM.
     *
     * @return the current value of salesM
     */
    public Set<Sales> getSalesM() {
        return salesM;
    }

    /**
     * Setter method for salesM.
     *
     * @param aSalesM the new value for salesM
     */
    public void setSalesM(Set<Sales> aSalesM) {
        salesM = aSalesM;
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
     * Compares the key for this instance with another Sales.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sales and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sales)) {
            return false;
        }
        Sales that = (Sales) other;
        Object mySaleId = this.getSaleId();
        Object yourSaleId = that.getSaleId();
        if (mySaleId==null ? yourSaleId!=null : !mySaleId.equals(yourSaleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sales.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sales)) return false;
        return this.equalKeys(other) && ((Sales)other).equalKeys(this);
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
        if (getSaleId() == null) {
            i = 0;
        } else {
            i = getSaleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Sales |");
        sb.append(" saleId=").append(getSaleId());
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
        ret.put("saleId", getSaleId());
        return ret;
    }

}
