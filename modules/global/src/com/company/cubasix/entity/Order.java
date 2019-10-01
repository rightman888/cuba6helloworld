package com.company.cubasix.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("Order %s (%s)|worker, startDate")
@Table(name = "CUBASIX_ORDER")
@Entity(name = "cubasix$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 4757103103471657586L;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE")
    protected Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "END_DATE")
    protected Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORKER_ID")
    protected Worker worker;

    @Column(name = "TOTAL_COST")
    protected Integer totalCost;

    @Column(name = "STATUS")
    protected OrderStatusEnum status;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public Worker getWorker() {
        return this.worker;
    }

    public void setWorker(final Worker worker) {
        this.worker = worker;
    }

    public Integer getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(final Integer totalCost) {
        this.totalCost = totalCost;
    }

    public OrderStatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(final OrderStatusEnum status) {
        this.status = status;
    }
}