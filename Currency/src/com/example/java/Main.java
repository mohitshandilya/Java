package com.example.java;

import java.math.BigDecimal;
import java.security.Principal;

public class Main {

    public static void main(String[] args) {
	    double d = 0.012;
	    double dSum = d + d + d;
        System.out.println("The Sum of the Double is : "+dSum);

        String dString = Double.toString(d);
        System.out.println("String Value : "+dString);

        BigDecimal bValue = new BigDecimal(dString);

        BigDecimal bSum = bValue.add(bValue).add(bValue);

        System.out.println("The Sum of Big decismal is :" + bSum.toString());
    }
}