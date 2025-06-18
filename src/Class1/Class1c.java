public class Class1c {
    public static void main(String[] args) {
        //looping 
        //Printing the sum of numbers starting from 1-100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        //Printing the sum of even numbers form 1-100
        int evenSum = 0;
        for (int a = 1; a <= 100; a++) {
            if(a % 2 == 0){
                evenSum += a;
            }
        }
        System.out.println("Even number sum is "+evenSum  );
    }
}
