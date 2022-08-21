package com.company.empl.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum JobTitle implements EnumClass<String> {

    WORKER("Worker"),
    DIRECTOR("Director");

    private String id;

    JobTitle(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static JobTitle fromId(String id) {
        for (JobTitle at : JobTitle.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}