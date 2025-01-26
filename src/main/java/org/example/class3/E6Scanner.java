package org.example.class3;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner fetch = new Scanner(System.in);
        System.out.println("Please Enter your Gender");
        char gender=fetch.next().charAt(0);
        System.out.println("you Entered "+gender);
        if(gender=='M'||gender=='m'){
            System.out.println("Male");
        }else if(gender=='F'||gender=='f'){
            System.out.println("Female");
        }else {
            System.out.println("Others");
        }


    }
}
