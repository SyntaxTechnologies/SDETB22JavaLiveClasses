package org.example.class3;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        Scanner fetch = new Scanner(System.in);
        System.out.println("Are you hungry?");

        boolean isHungry=fetch.nextBoolean();
        System.out.println("Are you hungry? "+isHungry);

    }
}
