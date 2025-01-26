package org.example.class3;
// java.util.Scanner its actually the location of the scanner class
import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {

        /*1) we have to create the object of a class to use its methods.
         2) Methods/functions/block of code contain the instructions to do something
         3) Scanner is the name of the class
         4)System.in tells the scanner class that we want to use it for
         taking the input from the users
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = input.nextInt();
        System.out.println("You entered the number "+num);


    }
}
