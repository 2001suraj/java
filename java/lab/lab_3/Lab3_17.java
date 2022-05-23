package lab.lab_3;

import java.util.Scanner;

public class Lab3_17 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = aa.nextInt();

        int a = 0, b;
        int v=n;
        while (n > 0) {
            b = n % 10;
            a = a + b * b * b;
            n = n / 10;
        }
        n=v;
        if (n == a) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not armstrong");
        }
aa.close();
    }

}
