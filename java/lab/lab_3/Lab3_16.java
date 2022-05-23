package lab.lab_3;

import java.util.Scanner;

public class Lab3_16 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = aa.nextInt();
        int i;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (n == i) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
        }
        aa.close();

    }
}
