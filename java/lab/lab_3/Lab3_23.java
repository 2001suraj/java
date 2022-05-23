package lab.lab_3;

import java.util.Scanner;

public class Lab3_23 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the term ");
        int n = aa.nextInt();
        int a = 0, b = 1, c = 0;
        // System.out.print(a+b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The " + n + " th of fibonacci number is " + c);
        aa.close();
    }
}
