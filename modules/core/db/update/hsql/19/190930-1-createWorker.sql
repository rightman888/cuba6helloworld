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
);