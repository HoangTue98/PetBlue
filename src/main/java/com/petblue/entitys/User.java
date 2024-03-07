// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "users", indexes = {@Index(name = "users_email_IX", columnList = "email", unique = true), @Index(name = "users_phone_IX", columnList = "phone", unique = true)})
public class User implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "userId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false, precision = 10)
    private int userId;
    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;
    @Column(unique = true, nullable = false, length = 255)
    private String email;
    @Column(nullable = false, length = 100)
    private String password;
    @Column(unique = true, nullable = false, length = 20)
    private String phone;
    @Column(nullable = false, precision = 10)
    private int sex;
    @Column(nullable = false, precision = 10)
    private int role;
    @Column(length = 200)
    private String avatar;
    @Column(precision = 10)
    private int status;
    @Column(precision = 10)
    private int otp;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "division_id", precision = 10)
    private int divisionId;
    @Column(name = "division_name", length = 100)
    private String divisionName;
    @Column(name = "district_id", precision = 10)
    private int districtId;
    @Column(name = "district_name", length = 100)
    private String districtName;
    @Column(name = "ward_name", length = 100)
    private String wardName;
    @Column(name = "ward_code", length = 45)
    private String wardCode;
    @Column(name = "address_detail", length = 255)
    private String addressDetail;
    @OneToMany(mappedBy = "users")
    private Set<Bill> bills;
    @OneToMany(mappedBy = "users")
    private Set<ProductVariant> productVariants;
    @OneToMany(mappedBy = "users2")
    private Set<ProductVariant> productVariants2;
    @OneToMany(mappedBy = "users2")
    private Set<Bill> bills2;
    @OneToMany(mappedBy = "users")
    private Set<Cart> carts;

}
