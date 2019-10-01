package com.company.cubasix.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

public enum OrderStatusEnum implements EnumClass<String> {

    SCHEDULED("scheduled"),
    DONE("done"),
    ACCEPTED("accepted");

    private String value;

    OrderStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String getId() {
        return value;
    }

}
