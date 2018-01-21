package com.java.designpatterns.chainresponsibility;

public class ATMDispenseChain {

    private DispenseChain c1;
    private Long amount;

    public ATMDispenseChain() {
        this.amount = amount;
        c1 = new Dollar50Dispense();

        Dollar20Dispense c2 = new Dollar20Dispense();
        Dollar10Dispense c3 = new Dollar10Dispense();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public void dispense(Long amount) {
        c1.dispense(amount);
    }


}