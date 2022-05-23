package lab.lab_3;

import java.util.Scanner;


public class lab3_3 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =aa.nextInt();
        int sum =0;
        for(int a = 1;a<=n;a++){
            sum +=a;
        }
        System.out.println("The sum of " + n +" natural number is " + sum);
        aa.close();
    }
}
