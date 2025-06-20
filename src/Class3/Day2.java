package Class3;
 //2. Create a static methods on Day2 class for all the following solutions
//a. FindGrade(int number) -> For a given number between 0-100 print grade for the provided number
//b. GuessGame(int chances) -> For a given chances allow user to guess the correct number.
//c. CountDigits(int number) -> For a given number count how many digit number is it. (EG: if 5667 the 4 digit number).

import java.util.Scanner;

public class Day2 {

    //a static method containing all the solutions
    public static void main (String[] args){

        //Creating a scanner object for taking the marks obtained by the student
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks of the Student");
        int marks = scan.nextInt();

        //Now checking the grade
        if(marks<40 || marks>0){
            System.out.println("F");
        }else if(marks < 0){
            System.out.println("Invalid");
        } else if (marks >40 || marks <60) {
            System.out.println("C");
        } else if (marks >60 || marks<70) {
            System.out.println("B");
        } else if (marks>70||marks<100) {
            System.out.println("A");
        }
    }

}

