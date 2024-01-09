package com.company.test.task.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TESTTASK_SUPPLIER")
@Entity(name = "testtask_Supplier")
@NamePattern("%s|name")
public class Supplier extends BaseLongIdEntity {
    private static final long serialVersionUID = -6746572437946967112L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}