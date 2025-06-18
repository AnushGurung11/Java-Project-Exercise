import java.util.Scanner;

/*
Multiplication table of a given number
 */
public class Home1d {
    public static void main (String[] args){
        //Using scanner for a number
        Scanner scan = new Scanner(System.in);

        System.out.println("Multiplication table of: ");

        int num = scan.nextInt();

        for(int i = 1 ; i <= 10 ; i ++){
            System.out.println(num*i);
        }

        int i = 1;
        while(i<=10){
            System.out.println(num*i);
            i++;
        }
    }

}
