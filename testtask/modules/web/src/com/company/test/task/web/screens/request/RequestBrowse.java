package com.company.test.task.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.task.entity.Request;

@UiController("testtask_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class RequestBrowse extends MasterDetailScreen<Request> {
}