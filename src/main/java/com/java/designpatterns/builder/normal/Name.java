package com.java.designpatterns.builder.normal;

import java.util.List;

public class Name {
    private final String firstName;
    private final List<String> middleNames;
    private final String surname;

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public String getSurname() {
        return surname;
    }

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleNames = builder.middleNames;
        this.surname = builder.surname;
    }

    public static class Builder {
        private String firstName;
        private List<String> middleNames;
        private String surname;

        public Builder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleNames(final List<String> middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        public Builder surname(final String surname) {
            this.surname = surname;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }
}