package lab.lab2;

import java.util.Scanner;

public class Lab_2_24 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = aa.nextInt();
        System.out.println("Enter the Second number");
        int b = aa.nextInt();
        int c =0;
        c =(a>b)?a:b;
        System.out.println(c+" is the greatest numbe");
        aa.close();

    }
}
