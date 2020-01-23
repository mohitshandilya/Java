/**
 * Java supports all basic operations + - * / % directly
 * And complex operations with the help of a special class called 'Math'
 *
 * Whenever you do a mathematical operations the datatype of the result
 * will be the widest datatype amongst the 2 parts
 * For e.g. int + double = double
 *
 */

package com.example.java;

public class Main {

    public static void main(String[] args) {
	    int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition = " +result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Substraction = " +result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication = " +result3);

        int result4 = intValue1 / intValue2;
        System.out.println("Division = " +result4); // this won't return desired output thus below

        double result6 = (double)intValue1 / intValue2;
        System.out.println("Division2 = " +result6);

        int result5 = intValue1 % intValue2;
        System.out.println("Remainder = " +result5);

        double result7 = (double)intValue1 % intValue2;
        System.out.println("Remainder2 = " +result7);

        //Using Math class below

        double doubleValue = -3.999999d;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded : " +rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute : " +absValue);

    }
}
