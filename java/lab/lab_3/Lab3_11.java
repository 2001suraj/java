package lab.lab_3;

import java.util.Scanner;

public class Lab3_11 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = aa.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }   
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");

            }
            System.out.println();
        }

        aa.close();
    }
}
