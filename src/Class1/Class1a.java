package Class1;

import java.util.Scanner;

public class Class1a {
    public static void main(String[] args){
        //
        int num1 = 10;
        double num2 = 2.1;
        String name = "Anush";
        boolean isPresent = true;


        //checking the condition for the +ve, -ve and zero value
        if(num1>=0 ){
            System.out.println("The number "+num1+" is positive.");
        }
        else if (num1 == 0){
            System.out.println("The number "+num1+" is Zero.");
        }
        else{
            System.out.println("The number "+num1+" is negative.");
        }


        //Checking if the number is divided by 5
        if(num1 % 5 == 0){
            System.out.println("The number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }

        //Checking if the number is even or odd
        if (num1 % 2 == 0 ){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        //Using scanner for taking a user input and checking if the number is divided by 2 or 3
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        //Checking if divided by 2 or 3
        if (number % 2== 0 ){
            System.out.println("The number is divided by 2.");
        }
        else if (number % 3 == 0){
            System.out.println("The number is divided by 3.");
        }

        //Checking if the number is odd and greater than 50
        if(number % 2 != 0 && number > 50 ){
            System.out.println("The number is odd and greater than 50.");
        }
        else{
            System.out.println("The number is either even or less than 50");
        }

        //Check if the number is in range of 10-100
        System.out.println("The number is in range of 10-100");


    }
}
