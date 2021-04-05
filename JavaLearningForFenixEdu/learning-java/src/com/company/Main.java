package com.company;
import org.w3c.dom.ls.LSInput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
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

        // -------------------------- Primitive and Reference Types
        int a  = 10;
        int b = a;
        a = 100;
        System.out.println("a" + a + "- b =" + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);

        // -------------------- Naming Variables

        int zero = 0 ;
        int two = 2;
        double pi_ = 2.1415;
        int subscriberCount = 1_000_000;

        // -------------------- The String Class
        char a_ = 'A';
        char b_ = 'B';
        String name_ = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = "codes";
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));

        //-----------------------------------package and import

        Date date_ = new Date();
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        //------------------------ Arithmetic Operations
        int ten = 10;
        int three = 3;
        int addition = ten + three;
        System.out.println( 10 + 2);
        System.out.println( 10 % 2);

        // ------------------------- Math Class
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(6,10));
        System.out.println(Math.min(6,10));
        System.out.println((int)Math.pow(5,2));
        System.out.println((int)Math.sqrt(25));
        System.out.println(Math.PI);

        // ---------------------- Comparison Operators
         int khalidAge = 20;
         int mariamAge = 20;
        System.out.println(khalidAge > mariamAge);
        System.out.println(khalidAge >= mariamAge);
        System.out.println(khalidAge < mariamAge);
        System.out.println(khalidAge <= mariamAge);
        System.out.println(khalidAge == mariamAge);
        System.out.println(khalidAge != mariamAge);
        // -------------------- Logic operators

        boolean areAdults = false;
        boolean areStudents = true;
        System.out.println(areAdults && areStudents);
        // ----------------------------------------- If statement
        // Just like C lang
        //---------------------------------------- ternary operators
        int age = 10;
        String message = age >= 18 ? "I'm and adult" : "I'm not an adult";
        System.out.println(message);

        // --------------------------------- Arrays
        int four = 4;
        int five = 5;
        int [] numbers = new int[5];
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));

        int [] algarisms =  { 2, 0, 1};
        System.out.println(Arrays.toString(algarisms));

        // ---------------------- Enhanced for loop
        for (int i : numbers) {
            System.out.println(i);
        }
        Arrays.stream(algarisms).forEach(System.out::println);
        // ------------------------------- User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello" + userName);
    }
    static class Person{
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
