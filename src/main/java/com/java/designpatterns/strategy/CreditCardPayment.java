package com.java.designpatterns.strategy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(BigDecimal bigDecimal) {
        System.out.println(bigDecimal + " paid using CreditCard. ");
    }
}