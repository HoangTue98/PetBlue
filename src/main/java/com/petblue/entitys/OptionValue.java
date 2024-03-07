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
@Table(name = "option_values")
public class OptionValue implements Serializable {

    /**
     * Primary key.
     */
    protected static final String PK = "valueId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Value_id", unique = true, nullable = false, precision = 10)
    private int valueId;
    @Column(name = "Value_name", nullable = false, length = 100)
    private String valueName;
    @Column(name = "Status", nullable = false, precision = 10)
    private int status;
    @Column(name = "is_show", precision = 10)
    private int isShow;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Option_id", nullable = false)
    private Option options;
    @OneToMany(mappedBy = "optionValues")
    private Set<VariantValue> variantValues;

}
