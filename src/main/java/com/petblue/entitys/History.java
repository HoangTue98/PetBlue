// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @HoangTue
 */
@Entity
@Table(name = "history")
public class History implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "historyId";
    @Id
    @Column(name = "history_id", unique = true, nullable = false, length = 50)
    private String historyId;
    @Column(name = "setting_id", nullable = false, precision = 10)
    private int settingId;
    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;
    @Column(nullable = false, length = 1000)
    private String description;


}
