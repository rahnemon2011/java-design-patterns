package com.java.designpatterns.builder;

import com.java.designpatterns.builder.nested.Account;
import org.junit.Test;

public class NestedBuilderTest {

    @Test
	public void test() {
        Account account = Account.newBuilder()
                .id(10L)
                .email("rahnemon2011@gmail.com")
                .addName()
                        .firstName("Hadi")
                        .surname("Mohammadi")
                        .done()
                 .addAddress()
                        .city("Chemnitz")
                        .houseNumber(91)
                        .street("Streinghtn")
                        .zipCode("91258")
                        .done()
                .build();

        System.out.println(account.getId() + " " + account.getAddress().getCity());
    }
}