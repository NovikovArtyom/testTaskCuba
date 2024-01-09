-- begin TESTTASK_CUSTOMER
create table TESTTASK_CUSTOMER (
    ID bigint,
    --
    NAME varchar(255) not null,
    CITY varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTTASK_CUSTOMER
-- begin TESTTASK_REQUEST
create table TESTTASK_REQUEST (
    ID bigint,
    --
    CUSTOMER_ID bigint not null,
    SUPPLIER_ID bigint not null,
    --
    primary key (ID)
)^
-- end TESTTASK_REQUEST
-- begin TESTTASK_PRODUCT
create table TESTTASK_PRODUCT (
    ID bigint,
    --
    NAME varchar(255) not null,
    COST double precision not null,
    --
    primary key (ID)
)^
-- end TESTTASK_PRODUCT
-- begin TESTTASK_REQUEST_ITEM
create table TESTTASK_REQUEST_ITEM (
    ID bigint,
    --
    PRODUCT_ID bigint not null,
    VOLUME double precision not null,
    REQUEST_ID bigint not null,
    --
    primary key (ID)
)^
-- end TESTTASK_REQUEST_ITEM
-- begin TESTTASK_SUPPLIER
create table TESTTASK_SUPPLIER (
    ID bigint,
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTTASK_SUPPLIER
