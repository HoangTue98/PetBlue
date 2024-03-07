// Generated with g9.

package com.petblue.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Set;

/**
 * @HoangTue
 */
@Entity(name = "options")
public class Option implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "optionId";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Option_id", unique = true, nullable = false, precision = 10)
    private int optionId;
    @Column(name = "Option_name", nullable = false, length = 100)
    private String optionName;
    @Column(name = "Status", nullable = false, precision = 10)
    private int status;
    @Column(name = "is_show", precision = 10)
    private int isShow;
    @OneToMany(mappedBy = "options")
    private Set<ProductOption> productOptions;
    @OneToMany(mappedBy = "options")
    private Set<OptionValue> optionValues;
}
