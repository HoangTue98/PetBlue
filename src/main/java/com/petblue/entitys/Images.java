// Generated with g9.

package com.petblue.entitys;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import no.g9.domain.annotation.G9Association;
import no.g9.domain.annotation.G9Attribute;
import no.g9.domain.annotation.G9Class;
import no.g9.domain.annotation.G9Exclude;

@Entity(name="images")
@G9Class(tableName="images", isPersistent=true)
public class Images implements Serializable {

    /** Primary key. */
    protected static final String PK = "imagesId";

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
    @Column(name="images_id", unique=true, nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, columnName="images_id", isPrimaryKey=true, isUnique=true, isNotNull=true, isIndex=true)
    private int imagesId;
    @Column(name="image_path", nullable=false, length=255)
    @G9Attribute(isPersistent=true, dbLength=255, columnName="image_path", isNotNull=true)
    private String imagePath;
    @Column(nullable=false, precision=10)
    @G9Attribute(isPersistent=true, precision=10, defaultValue="1", isNotNull=true)
    private int status;
    @ManyToOne(optional=false)
    @JoinColumn(name="product_variant_id", nullable=false)
    @G9Association(name="productVariantId", isPersistent=true, isMandatory=true, oppositeRole="images", ownerRole="productVariants", memberColumnNames="product_variant_id", isIndexOnForeignKey=true)
    private ProductVariants productVariants;

    /** Default constructor. */
    public Images() {
        super();
    }

    /**
     * Access method for imagesId.
     *
     * @return the current value of imagesId
     */
    public int getImagesId() {
        return imagesId;
    }

    /**
     * Setter method for imagesId.
     *
     * @param aImagesId the new value for imagesId
     */
    public void setImagesId(int aImagesId) {
        imagesId = aImagesId;
    }

    /**
     * Access method for imagePath.
     *
     * @return the current value of imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Setter method for imagePath.
     *
     * @param aImagePath the new value for imagePath
     */
    public void setImagePath(String aImagePath) {
        imagePath = aImagePath;
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
     * Compares the key for this instance with another Images.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Images and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Images)) {
            return false;
        }
        Images that = (Images) other;
        if (this.getImagesId() != that.getImagesId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Images.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Images)) return false;
        return this.equalKeys(other) && ((Images)other).equalKeys(this);
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
        i = getImagesId();
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
        StringBuffer sb = new StringBuffer("[Images |");
        sb.append(" imagesId=").append(getImagesId());
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
        ret.put("imagesId", Integer.valueOf(getImagesId()));
        return ret;
    }

}
