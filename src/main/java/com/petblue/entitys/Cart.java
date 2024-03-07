// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Set;

/**
 * @HoangTue
 */
@Entity
@Table(name = "carts")
public class Cart implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "cartId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", unique = true, nullable = false, precision = 10)
    private int cartId;
    @Column(nullable = false, precision = 10)
    private int status;
    @OneToMany(mappedBy = "carts")
    private Set<CartDetail> cartDetails;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User users;


}
