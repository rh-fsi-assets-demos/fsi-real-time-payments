alter table PAYMENT add constraint UQ_PAYMENT_DOMESTIC_PAYMENT_ID unique (DOMESTIC_PAYMENT_ID);
alter table ACCOUNT add constraint UQ_ACCOUNT_ACCOUNT_ID unique (ACCOUNT_ID);