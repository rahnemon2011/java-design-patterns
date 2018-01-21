package com.java.designpatterns.chainresponsibility;

import java.util.Scanner;

public class ATMDemo {

    public static void main(String[] args) {

        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        System.out.println(" Enter 0 to exit ");
        Long amount = (long) -1;

        while (amount != 0) {
            Scanner sc = new Scanner(System.in);
            amount = sc.nextLong();
            if (amount == 0 || (amount % 10 != 0)) {
                break;
            } else {
                atmDispenseChain.dispense(amount);
            }
        }
    }
} 