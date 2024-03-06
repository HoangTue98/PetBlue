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

@Entity(name="carts")
@G9Class(tableName="carts", isPersistent=true)
public class Carts implements Serializable {

    /** Primary key. */
    protected static final String PK = "cartId";

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
    @Column(name="cart_id", unique=true, nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="cart_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private int cartId;
    @Column(nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="0", isNotNull=true)
    private int status;
    @OneToMany(mappedBy="carts")
    @G9Association(name="cartId", isPersistent=true, oppositeRole="carts", ownerRole="carts")
    private Set<CartDetails> cartDetails;
    @ManyToOne(optional=false)
    @JoinColumn(name="user_id", nullable=false)
    @G9Association(name="userindex", isPersistent=true, isMandatory=true, oppositeRole="carts", ownerRole="users", memberColumnNames="user_id", isIndexOnForeignKey=true)
    private Users users;

    /** Default constructor. */
    public Carts() {
        super();
    }

    /**
     * Access method for cartId.
     *
     * @return the current value of cartId
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * Setter method for cartId.
     *
     * @param aCartId the new value for cartId
     */
    public void setCartId(int aCartId) {
        cartId = aCartId;
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
     * Access method for cartDetails.
     *
     * @return the current value of cartDetails
     */
    public Set<CartDetails> getCartDetails() {
        return cartDetails;
    }

    /**
     * Setter method for cartDetails.
     *
     * @param aCartDetails the new value for cartDetails
     */
    public void setCartDetails(Set<CartDetails> aCartDetails) {
        cartDetails = aCartDetails;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Compares the key for this instance with another Carts.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Carts and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Carts)) {
            return false;
        }
        Carts that = (Carts) other;
        if (this.getCartId() != that.getCartId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Carts.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Carts)) return false;
        return this.equalKeys(other) && ((Carts)other).equalKeys(this);
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
        i = getCartId();
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
        StringBuffer sb = new StringBuffer("[Carts |");
        sb.append(" cartId=").append(getCartId());
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
        ret.put("cartId", Integer.valueOf(getCartId()));
        return ret;
    }

}
