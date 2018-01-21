package com.java.designpatterns.builder.normal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account.Builder()
                .id(10L)
                .email("rahnemon2011@gmail.com")
                .name(new Name.Builder()
                        .firstName("Hadi")
                        .surname("Mohammadi")
                        .build()
                )
                .address(new Address.Builder()
                        .city("Chemnitz")
                        .houseNumber(91)
                        .street("Streinghtn")
                        .zipCode("91258")
                        .build())
                .build();

    }
} 