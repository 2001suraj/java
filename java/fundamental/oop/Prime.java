package fundamental.oop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
      
        int value =PrimeCount(1,9 );
        System.out.println("the prime number are "+ value);
        
    }
    public static int PrimeCount(int start, int end){
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        start = a.nextInt();
        System.out.println("Enter the second number");
        end  = a.nextInt();
        int count = 1;
        int pp =0;
        for (int i = start; i <= end; i++) {
            if (start % i == 0) {
                count++;
            }
            if(count==3){
                pp++;
                return pp;
            }
        }
        return pp;
    }
}
