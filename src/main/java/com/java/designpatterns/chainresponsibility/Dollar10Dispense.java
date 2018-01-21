package com.java.designpatterns.chainresponsibility;

public class Dollar10Dispense implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount) {
        if (amount >= 10) {
            Long divide = amount / 10;
            System.out.println("number of 10Dollars:" + divide);
            long remainder = amount % 10;
            if (remainder != 0)
                nextChain.dispense(remainder);
        } else {
            nextChain.dispense(amount);
        }
    }
}