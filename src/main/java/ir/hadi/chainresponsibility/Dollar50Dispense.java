package ir.hadi.chainresponsibility;

import java.math.BigDecimal;

public class Dollar50Dispense implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount) {
        if (amount >= 50) {
            Long divide = amount / 50;
            System.out.println("number of 50Dollars:" + divide);
            long remainder = amount % 50;
            if (remainder != 0)
                nextChain.dispense(remainder);
        } else {
            nextChain.dispense(amount);
        }
    }
}