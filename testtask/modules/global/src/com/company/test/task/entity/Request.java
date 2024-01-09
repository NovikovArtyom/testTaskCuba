package com.company.test.task.entity;

import com.haulmont.cuba.core.entity.BaseLongIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "TESTTASK_REQUEST")
@Entity(name = "testtask_Request")
public class Request extends BaseLongIdEntity {
    private static final long serialVersionUID = 6896759874117984111L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SUPPLIER_ID")
    private Supplier supplier;

    @OneToMany(mappedBy = "request")
    private List<RequestItem> items;

    public List<RequestItem> getItems() {
        return items;
    }

    public void setItems(List<RequestItem> items) {
        this.items = items;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}