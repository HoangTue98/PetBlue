// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;

/**
 * @HoangTue
 */
@Entity
@Table(name = "images")
public class Image implements Serializable {
    /**
     * Primary key.
     */
    protected static final String PK = "imagesId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "images_id", unique = true, nullable = false, precision = 10)
    private int imagesId;
    @Column(name = "image_path", nullable = false, length = 255)
    private String imagePath;
    @Column(nullable = false, precision = 10)
    private int status;
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_variant_id", nullable = false)
    private ProductVariant productVariants;
}
