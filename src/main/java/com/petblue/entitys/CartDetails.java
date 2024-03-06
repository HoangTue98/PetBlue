// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity(name="cart_details")
@G9Class(tableName="cart_details", isPersistent=true)
public class CartDetails implements Serializable {

    /** Primary key. */
    protected static final String PK = "cartDetailId";

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
    @Column(name="cart_detail_id", unique=true, nullable=false, length=255)
    @G9Attribute(isPersistent=true, dbLength=255, columnName="cart_detail_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private String cartDetailId;
    @Column(nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", isNotNull=true)
    private int quantity;
    @Column(name="created_date")
    @G9Attribute(isPersistent=true, columnName="created_date")
    private LocalDateTime createdDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="cart_id", nullable=false)
    @G9Association(name="cartId", isPersistent=true, isMandatory=true, oppositeRole="cartDetails", ownerRole="carts", memberColumnNames="cart_id", isIndexOnForeignKey=true)
    private Carts carts;
    @ManyToOne(optional=false)
    @JoinColumn(name="variant_id", nullable=false)
    @G9Association(name="variantId", isPersistent=true, isMandatory=true, oppositeRole="cartDetails", ownerRole="productVariants", memberColumnNames="variant_id", isIndexOnForeignKey=true)
    private ProductVariants productVariants;

    /** Default constructor. */
    public CartDetails() {
        super();
    }

    /**
     * Access method for cartDetailId.
     *
     * @return the current value of cartDetailId
     */
    public String getCartDetailId() {
        return cartDetailId;
    }

    /**
     * Setter method for cartDetailId.
     *
     * @param aCartDetailId the new value for cartDetailId
     */
    public void setCartDetailId(String aCartDetailId) {
        cartDetailId = aCartDetailId;
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
     * Access method for carts.
     *
     * @return the current value of carts
     */
    public Carts getCarts() {
        return carts;
    }

    /**
     * Setter method for carts.
     *
     * @param aCarts the new value for carts
     */
    public void setCarts(Carts aCarts) {
        carts = aCarts;
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
     * Compares the key for this instance with another CartDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CartDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CartDetails)) {
            return false;
        }
        CartDetails that = (CartDetails) other;
        Object myCartDetailId = this.getCartDetailId();
        Object yourCartDetailId = that.getCartDetailId();
        if (myCartDetailId==null ? yourCartDetailId!=null : !myCartDetailId.equals(yourCartDetailId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CartDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CartDetails)) return false;
        return this.equalKeys(other) && ((CartDetails)other).equalKeys(this);
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
        if (getCartDetailId() == null) {
            i = 0;
        } else {
            i = getCartDetailId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CartDetails |");
        sb.append(" cartDetailId=").append(getCartDetailId());
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
        ret.put("cartDetailId", getCartDetailId());
        return ret;
    }

}
