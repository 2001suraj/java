package myclass;

import java.util.Scanner;

public class Mathematical_operator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float first = Sc.nextInt();
       
        System.out.println("Enter the first number");
        float second = Sc.nextInt();
        float sum = first + second;
        float diff = first - second;
        float div = first / second;
        float mul = first * second;
        float per = (first * second)/100;

        System.out.println(" The sum is  = " + sum + "\nThe diff is = " + diff + " \nThe div is  = " + div
                + "\nThe mul is = " + mul + "\nThe per is =" + per);
Sc.close();


    }
}
