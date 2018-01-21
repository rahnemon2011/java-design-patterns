package com.java.designpatterns.builder.normal;

public class Account {
    private final Long id;
    private final String email;
    private final Name name;
    private final Address address;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    private Account(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static class Builder {
        private Long id;
        private String email;
        private Name name;
        private Address address;

        public Builder id(final Long id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder name(final Name name) {
            this.name = name;
            return this;
        }

        public Builder address(final Address address) {
            this.address = address;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }




} 