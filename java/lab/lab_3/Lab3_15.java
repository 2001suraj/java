package lab.lab_3;

import java.util.Scanner;

public class Lab3_15 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = aa.nextInt();
        int b = 1;
        for (int i = a; i >= 1; i--) {
            b = b * i;
            System.out.println("The factorial " + "of " + a + " is" + b);

        }
        aa.close();
    }
}
