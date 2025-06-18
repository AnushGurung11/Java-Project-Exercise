import java.util.Scanner;

public class Home1g {
    public static void main (String[] args){
        //Using for loop for getting the factorial a entered number

        //Adding a scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to get the factorial of :");

        int number = scan.nextInt();

        int factorial = 1;
        for(int i  = 1 ; i <= number; i ++ ){
            factorial = factorial * i ;
        }

        System.out.println("The Factorial is :"+ factorial);
    }

}
