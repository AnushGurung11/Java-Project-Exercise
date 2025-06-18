import java.util.Scanner;

public class Home1f {
    public static void main(String[] args){
        //Asking for user input for characters and stop only when entered q

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any letter for the endless loop for ending the loop .");
        String letter ;
        do{
            System.out.println("Enter the letter: ");
            letter = scan.next().toLowerCase();


        }while(!letter.equals("q"));

        System.out.println("The program stopped");
    }
}
