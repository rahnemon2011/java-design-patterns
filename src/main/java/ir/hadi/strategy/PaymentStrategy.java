package ir.hadi.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal bigDecimal);
} 