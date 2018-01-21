package com.java.designpatterns.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal bigDecimal);
} 