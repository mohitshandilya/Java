/**
 * TWO Rules :
 * 1) When we assign value from one Primitive Datatype to other, then we are copying the value and not referencing it.
 * 2) And if we are Narrowing we have to add explicit casting syntax
 * there are two types : Widening and Narrowing.
 * Widening is automatic and there is no data loss (smaller type to a larger type).
 * But Narrowing there is a risk of data loss, so we have to add explicit casting syntax
 * ALT + ENTER on the right side value to automatically cast it with the narrow down value
 */

package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 48;
        int intvalue2 = intValue1; //we are copying the values and not referencing it.

        System.out.println("The 2nd Value is : " + intvalue2);

        long longValue1 = intValue1; //Widening from Smaller type to larger - automatic - no explicit casting syntax.
        System.out.println("The Long Value is : " + longValue1);

        short shortValue1 = (short) intValue1;// This is Narrowing from Larger datatype(int) to Smaller (Short) we
                                              // explicitly add "(short)" in front of the value.
                                              // In this case however, there is no data loss as short can handle value = 48
        System.out.println("The Short Value is : " + shortValue1);

        int intValue3 = 1024;
        byte byteValue1 = (byte) intValue1; //This is narrowing down with data loss as Max Byte value is +127
        System.out.println("The byte Value is : " + byteValue1);

        double doubleValue1 = 3.99999d;
        int inteValue4 = (int) doubleValue1; //narrowing with data loss - Value gets truncated.
        System.out.println("The int from double Value is : " + inteValue4);
    }
}
