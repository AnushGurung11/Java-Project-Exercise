import java.util.Scanner;

public class Home1i {
    public static void main(String[] args){
        //Checking whether the given number is prime or not
        try{

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check for prime:");

        int num = scan.nextInt();
        int counter = 0;

        for(int i = 1; i <= num ; i++){
            if(num % i == 0) {
                counter++;
            }
        }

        if(counter > 2){
            System.out.println("The number is not prime.");

        }
        else{
            System.out.println("The number is prime.");
        }

        }catch(Exception exception){
            System.out.println("An error !!");
        }


    }
}
