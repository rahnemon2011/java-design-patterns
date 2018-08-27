package com.java.designpatterns.chainresponsibility;

/**
 * Only accept numbers base on 10, for example 10,20,80,100,120
 * but 0, 8,19,82, ... are not acceptable.
 */
public class ATMDispenseChain {

    private DispenseChain c1;

    public ATMDispenseChain() {
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