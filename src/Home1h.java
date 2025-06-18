import java.util.Scanner;

public class Home1h {
    public static void main(String[] args){
        //Take a user input as string and select one a time parse it to int

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit ");

        String number = scan.next();

        int i = 0;
        int sum = 0;
        while(number.length() > i){
            sum  += Integer.parseInt(String.valueOf(number.charAt(i)));
            i++;
        }

        System.out.println("The sum becomes"+sum);

    }
}
