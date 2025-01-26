package org.example.class3;

public class E2NestedIf {
    public static void main(String[] args) {


        int age=45;
        double totalAmount=3500;

        if(age>40){

            if(totalAmount>2000){
                System.out.println("You will get 20% discount");
            }else if(totalAmount>1000){
                System.out.println("You will get 30% discount");
            } else {
                System.out.println("No Discount");
            }
        }else{

            if(totalAmount>4000){
                System.out.println("You will get a 25% discount");
            }else if(totalAmount>3000){
                System.out.println("You will get a 28% discount");
            }
        }
    }
}
