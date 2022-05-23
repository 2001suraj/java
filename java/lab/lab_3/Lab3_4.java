package lab.lab_3;

import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       
        int sum=0;
        int avg =0;
        int c;
        System.out.println("Enter the five number");
        for(int b=1;b<=5;b++){
        c = a.nextInt();
           sum +=c;
        }
        avg = sum/5;
        System.out.println("The sum is :" + sum);
        System.out.println("The Average is :" + avg);
        a.close();
    }
}
