package com.company.planner.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PLANNER_REQUEST")
@Entity(name = "planner_Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = 2540647713493466245L;
}