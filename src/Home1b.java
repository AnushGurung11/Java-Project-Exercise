import java.util.Scanner;

public class Home1b {
    public static void main(String[] args){
        //TODO Scanning for user input
        //TODO Creating Switch cases for printing the corresponding Day

        //Creating a scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number form 1-7");

        int choice = scan.nextInt();

        //Creating a switch case

        switch (choice){
            case 1:
                System.out.println("Sunday");
                break;

            case 2 :
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
        }

    }
}
