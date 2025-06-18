package Cash;


import java.util.Scanner;

public class Cash {
    //TODO accept amount
    //TODO Deduct the product cost
    //TODO give the change and make the minimum number of notes

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the payment done by customer:");
        double paidAmount = scan.nextDouble();

        System.out.println("Enter the cost of the item:;");
        double cost = scan.nextDouble();

        int[] av = {50,20,10,5};

        //Remaining amount to pay

        if (paidAmount < cost){
            System.out.println("Insufficient amount.");
        }else{
            double due = paidAmount - cost;
            int total =0;
            for(int each : av){
                if(due >= each){
                    int notes = (int) (due/each);
                    due = due - (notes*each);
                    total += notes;
                    System.out.println("Number of "+each+" note is "+notes);

                }
            }
            System.out.println("Total Number of notes is "+total);

        }



    }
}
