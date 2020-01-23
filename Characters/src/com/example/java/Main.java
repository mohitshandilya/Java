/**
 * Char is a primitive datatype
 * String is an complex object
 *
 */

package com.example.java;

public class Main {

    public static void main(String[] args) {
	    char c1 = '1';
	    char c2 = '2';
	    char c3 = '3';

        System.out.println("Char C1 = "+c1);
        System.out.println("Char C2 = "+c2);
        System.out.println("Char C3 = "+c3);

        char dollarSign = '\u0024'; //Unicode for $ sign
        System.out.println("Currency : " +dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.print(Character.toUpperCase(a1)); // Not Printing as println
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

    }
}
