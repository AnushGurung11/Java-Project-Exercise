import java.util.Scanner;

public class Home1e {
    public static void main(String[] args){
        //TODO Give the proper message
        //TODO loop until it is between 40 and 60


        //Creating a scanner object for the user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number for the endless loop for ending the loop enter umber between 40 -60 .");
        int number =0;
        do{
            System.out.println("Enter the number: ");
            number = scan.nextInt();


        }while(number<40 || number >60);

        System.out.println("The program stopped");

    }
}
