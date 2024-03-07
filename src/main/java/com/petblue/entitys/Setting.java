// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "settings")
public class Setting implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "settingId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "setting_id", unique = true, nullable = false, precision = 10)
    private int settingId;
    @Column(name = "user_edit", precision = 10)
    private int userEdit;
    @Column(name = "phone_shop", length = 100)
    private String phoneShop;
    @Column(length = 255)
    private String email;
    @Column(length = 100)
    private String password;
    @Column(length = 255)
    private String bank;
    @Column(name = "division_id", precision = 10)
    private int divisionId;
    @Column(name = "division_name", length = 100)
    private String divisionName;
    @Column(name = "district_id", precision = 10)
    private int districtId;
    @Column(name = "district_name", length = 100)
    private String districtName;
    @Column(name = "ward_code", length = 10)
    private String wardCode;
    @Column(name = "ward_name", length = 100)
    private String wardName;
    @Column(name = "address_detail", length = 100)
    private String addressDetail;
    @Column(name = "update_day")
    private LocalDateTime updateDay;


}
