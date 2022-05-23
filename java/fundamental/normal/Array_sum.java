package fundamental.normal;

import java.util.Scanner;

public class Array_sum {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number of array size");
        int arra = aa.nextInt();
        int number[] = new int[arra];
        int sum = 0, i, avg;
        for (i = 0; i < arra; i++) {
            System.out.printf("Enter the %d number in array \n", (i + 1));
            number[i] = aa.nextInt();
            sum = sum + number[i];
        }
        avg = sum / arra;
        System.out.println(" The sum is " + sum);
        System.out.println(" The avg is " + avg);

    }
}
