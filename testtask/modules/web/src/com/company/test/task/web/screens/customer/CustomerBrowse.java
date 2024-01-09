package com.company.test.task.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.task.entity.Customer;

@UiController("testtask_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CustomerBrowse extends MasterDetailScreen<Customer> {
}