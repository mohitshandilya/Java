package com.example.java;

public class Main {

    static boolean dDef; // Default value of a boolean is false
                         // As ALL local variables must be initiated, thus declaring this here in this class

    public static void main(String[] args) {
	    boolean b1 = true;
	    boolean b2 = false;

        System.out.println("The value of b1 is : " +b1);
        System.out.println("The value of b2 is : " +b2);
        System.out.println("The value of dDef is : " +dDef);

        boolean b3 = !b1; //Not operator !
        System.out.println("The value of b3 is : " +b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is : " +b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed :" +parsed);


    }
}
