package com.company.test.task.web.screens.requestitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.task.entity.RequestItem;

@UiController("testtask_RequestItem.edit")
@UiDescriptor("request-item-edit.xml")
@EditedEntityContainer("requestItemDc")
@LoadDataBeforeShow
public class RequestItemEdit extends StandardEditor<RequestItem> {
}