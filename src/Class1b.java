import java.util.Scanner;

public class Class1b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        //condition for greater than 30 and divided by 4
        if (num1 > 30) {
            System.out.println("The number is greater than 30.");
        }else{
            System.out.println("The number is less than 30.");
        }
        if (num1 %4 == 0){
            System.out.println("The number is divisible by 4");

        }else {
            System.out.println("The number is not divisible by 4");
        }



    }
}
