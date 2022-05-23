package fundamental.normal;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not");
        int num = a.nextInt();
        int count = 1;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==3){
            System.out.println(num +" is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }
        

        a.close();
    }
}
