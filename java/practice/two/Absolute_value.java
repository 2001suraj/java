package practice.two;

import java.util.Scanner;

public class Absolute_value {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = aa.nextInt();
        int b = 0;
        if (a < 0) {
            b = a * -1;
        } else {
            b = a;
        }
        System.out.println(" The absolute value of " + a + " is " + b);
        aa.close();
    }
}
