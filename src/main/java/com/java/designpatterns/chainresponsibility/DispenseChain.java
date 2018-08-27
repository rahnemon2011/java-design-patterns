package com.java.designpatterns.chainresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Long amount);
}