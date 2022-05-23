package myclass;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first number");
        long a = sc.nextInt();

        System.out.println("Enter the  second number");
        long b = sc.nextInt();

        System.out.println("Enter the  third number");
        long c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is the greatest number");
        }
        if (b > a && b > c) {
            System.out.println("B is the greatest number");
        } else {
            System.out.println("C is the greatest number");

        }
        sc.close();

    }
}
