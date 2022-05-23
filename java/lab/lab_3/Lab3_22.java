// 1 1 2 3 5 8 13 
package lab.lab_3;

import java.util.Scanner;

public class Lab3_22 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = aa.nextInt();
        int a = 0, b = 1, d;
        System.out.print(a + " " + b);
        for (int c = 2; c <= n; c++) {
            d = a + b;
            System.out.print(" " + d);
            a = b;
            b = d;
        }
        aa.close();
    }
}
