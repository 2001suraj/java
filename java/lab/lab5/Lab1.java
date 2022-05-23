package lab.lab5;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the size array");
        int n = aa.nextInt();
        int[] arry = new int[n];
        System.out.println("Enter the array element" );

        for (int i = 0; i < n; i++) {
            arry[i] = aa.nextInt();
        }
        for (int i = 0; i <n; i++) {
            System.out.println(arry[i] + " ");
        }

    }
}
