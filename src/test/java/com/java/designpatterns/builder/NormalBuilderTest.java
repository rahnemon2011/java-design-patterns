package com.java.designpatterns.builder;

import com.java.designpatterns.builder.normal.Account;
import com.java.designpatterns.builder.normal.Address;
import com.java.designpatterns.builder.normal.Name;
import org.junit.Test;

public class NormalBuilderTest {

    @Test
    public void test() {
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