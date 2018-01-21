package ir.hadi.chainresponsibility;

import java.math.BigDecimal;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Long amount);
}