alter table CUBASIX_ORDER alter column ORDER_DATE rename to ORDER_DATE__U55349 ^
alter table CUBASIX_ORDER add column DESCRIPTION varchar(255) ;
alter table CUBASIX_ORDER add column STATUS varchar(50) ;
alter table CUBASIX_ORDER add column END_DATE date ;
alter table CUBASIX_ORDER add column WORKER_ID varchar(36) ;
alter table CUBASIX_ORDER add column START_DATE date ;
alter table CUBASIX_ORDER add column TOTAL_COST integer ;
