package com.company;

import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 10;
        String brand = "SushiManequim";
        double number_double = 10.01;
        Date date = new Date();

        // Primitive for integers
        byte theByte = -128; //1 byte
        short theShort = 2222; //2 bytes
        int theInt = 4547944; //4 bytes
        long theLong = 320239L;// 8 bytes

        float pi = 3.142F;
        double doublePi = 3.1415;

        boolean isAdult = true; //false

        char nameInit = 'A';

        System.out.println(theByte);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theShort);
        System.out.println(isAdult);

        String name = new String("Company");
        System.out.println(name.toUpperCase());
    }
}
