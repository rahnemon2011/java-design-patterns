package com.java.designpatterns.chainresponsibility;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeResponsibilityTest {

    @Test
    public void atmTest() {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        List<Long> amountList = new ArrayList<>();
        amountList.add(30L);
        amountList.add(70L);
        amountList.add(180L);
        amountList.add(370L);

        for (Long amount : amountList) {
            System.out.println("The cash for " + amount + " are : ");
            if (amount.equals(0) || (amount % 10 != 0)) {
                break;
            } else {
                atmDispenseChain.dispense(amount);
            }
            System.out.println("---------------------------");
        }
    }
} 