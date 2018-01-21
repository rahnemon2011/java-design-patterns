package com.java.designpatterns.chainresponsibility;

public class Dollar20Dispense implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount) {
        if (amount >= 20) {
            Long divide = amount / 20;
            System.out.println("number of 20Dollars:" + divide);
            long remainder = amount % 20;
            if (remainder != 0)
                nextChain.dispense(remainder);
        } else {
            nextChain.dispense(amount);
        }
    }
}