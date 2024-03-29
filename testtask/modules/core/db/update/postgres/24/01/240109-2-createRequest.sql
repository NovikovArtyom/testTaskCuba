alter table TESTTASK_REQUEST add constraint FK_TESTTASK_REQUEST_ON_CUSTOMER foreign key (CUSTOMER_ID) references TESTTASK_CUSTOMER(ID);
alter table TESTTASK_REQUEST add constraint FK_TESTTASK_REQUEST_ON_SUPPLIER foreign key (SUPPLIER_ID) references TESTTASK_SUPPLIER(ID);
create index IDX_TESTTASK_REQUEST_ON_CUSTOMER on TESTTASK_REQUEST (CUSTOMER_ID);
create index IDX_TESTTASK_REQUEST_ON_SUPPLIER on TESTTASK_REQUEST (SUPPLIER_ID);
