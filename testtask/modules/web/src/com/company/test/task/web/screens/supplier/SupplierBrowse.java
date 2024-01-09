package com.company.test.task.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.task.entity.Supplier;

@UiController("testtask_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class SupplierBrowse extends MasterDetailScreen<Supplier> {
}