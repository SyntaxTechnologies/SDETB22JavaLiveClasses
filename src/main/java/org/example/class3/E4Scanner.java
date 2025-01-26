package org.example.class3;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        Scanner fetch = new Scanner(System.in);
        System.out.println("Please Enter your name");
       // String name=fetch.next();
        String name=fetch.nextLine();
        System.out.println("Hi "+name);

    }
}
