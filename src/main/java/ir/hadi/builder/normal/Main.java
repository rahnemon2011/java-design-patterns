package ir.hadi.builder.normal;

import ir.hadi.builder.normal.Account;
import ir.hadi.builder.normal.Address;
import ir.hadi.builder.normal.Name;

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