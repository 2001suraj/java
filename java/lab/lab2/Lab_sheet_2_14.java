package lab.lab2;

import java.util.Scanner;

public class Lab_sheet_2_14 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println(" enter three digit number");
        int number = ss.nextInt();
        int sum = 0;
        while (number == 3) {
            // finds the last digit of the given number
            int digit = number % 10;
            // adds last digit to the variable sum
            sum = sum + digit;
            // removes the last digit from the number
            number = number / 10;
        }
       

        System.out.println("Sum of Digits: "+sum);
            ss.close();
    }
}
