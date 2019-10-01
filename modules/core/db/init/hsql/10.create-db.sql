-- begin CUBASIX_CUSTOMER
create table CUBASIX_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255),
    MIDDLENAME varchar(255),
    LASTNAME varchar(255),
    PHONE varchar(255),
    --
    primary key (ID)
)^
-- end CUBASIX_CUSTOMER
-- begin CUBASIX_ORDER
create table CUBASIX_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(255),
    START_DATE date,
    END_DATE date,
    CUSTOMER_ID varchar(36),
    WORKER_ID varchar(36),
    TOTAL_COST integer,
    STATUS varchar(50),
    --
    primary key (ID)
)^
-- end CUBASIX_ORDER
-- begin CUBASIX_WORKER
create table CUBASIX_WORKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255),
    MIDDLENAME varchar(255),
    LASTNAME varchar(255),
    RATE integer,
    --
    primary key (ID)
)^
-- end CUBASIX_WORKER
