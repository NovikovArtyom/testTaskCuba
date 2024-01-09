package com.company.test.task.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.task.entity.Product;

@UiController("testtask_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductBrowse extends MasterDetailScreen<Product> {
}