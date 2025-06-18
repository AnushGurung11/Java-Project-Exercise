import java.util.Scanner;

public class Home1a {
    public static void main(String[] args){
        //TODO Creating a switch case
        //TODO selection of 3 options

        System.out.println("1.Add     2.sub      3.Multiply");
        System.out.println("Enter the corresponding number for action.");
        //Using Scanner
        Scanner scan = new Scanner(System.in);

        int choice = scan.nextInt();

        System.out.println("Enter the 2 numbers for calculation");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //Using a switch case for the action


        switch (choice){
            case 1:

                System.out.println(num1 + num2 );

                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;

        }

    }
}
