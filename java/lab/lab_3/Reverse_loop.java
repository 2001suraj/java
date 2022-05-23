package lab.lab_3;

import java.util.Scanner;

public class Reverse_loop {
    public static void main(String[] args) {
        Scanner aa =new Scanner(System.in);
        System.out.println(" Enter the  number ");
        int d  = aa.nextInt();
        int i, j;
        for (i = d; i >= 1; i--) {
            for (j = i - 1; j <= d; j++) {
                System.out.print(" ");
            }

            for (j = i - 1; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
