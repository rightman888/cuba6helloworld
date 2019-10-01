package com.company.cubasix.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Set;

@NamePattern("%s %s %s|firstName, lastName, middleName")
@Table(name = "CUBASIX_WORKER")
@Entity(name = "cubasix$Worker")
public class Worker extends StandardEntity {
    private static final long serialVersionUID = 3619583574406644219L;

    @NotNull
    @Column(name = "FIRSTNAME")
    protected String firstName;

    @NotNull
    @Column(name = "MIDDLENAME")
    protected String middleName;

    @NotNull
    @Column(name = "LASTNAME")
    protected String lastName;

    @NotNull
    @Column(name = "RATE")
    protected Integer rate;

    @Composition
    @OneToMany(mappedBy = "worker")
    protected Set<Order> orders;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Integer getRate() {
        return this.rate;
    }

    public void setRate(final Integer rate) {
        this.rate = rate;
    }

    public Set<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(final Set<Order> orders) {
        this.orders = orders;
    }
}