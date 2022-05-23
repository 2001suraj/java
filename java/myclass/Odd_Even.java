package myclass;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int number;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number");
        number = ss.nextInt();
        if (number % 2 == 0) {
            System.out.println(" the number is even ");
        } else {
            System.out.println(" The number is odd");
        }
        ss.close();

    }
}
