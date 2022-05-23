package lab.lab2;

import java.util.Scanner;

public class Lab2_26 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = a.nextInt();
        String c;
        c = (n%5==0 )?"Divisible by 5 and even ":"not Divisible";
        System.out.println(n +" is " + c);
        a.close();
    }
}
