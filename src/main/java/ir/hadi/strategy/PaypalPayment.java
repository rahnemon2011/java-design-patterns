package ir.hadi.strategy;

import java.math.BigDecimal;

public class PaypalPayment implements PaymentStrategy {

    private String email;
    private String pass;

    public PaypalPayment(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(BigDecimal bigDecimal) {
        System.out.println(bigDecimal + " paid using Paypal. ");
    }
}