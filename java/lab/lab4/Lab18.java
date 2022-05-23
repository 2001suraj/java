package lab.lab4;

import java.util.Scanner;

public class Lab18 {
    static int power(int m, int n){
        return(int )Math.pow(m, n);
    }
    static int power(int m){
        return(int )Math.pow(m,2);
    }
    public static void main(String[] args) {
        Scanner aa =new Scanner(System.in);
        System.out.println("Enter value of m :");
        int m = aa.nextInt();
        System.out.println("Enter value of n :");
        int n = aa.nextInt();
        System.out.println("Calculate result : " + power(m, n));
        System.out.println("Calculate result : " + power(m));
        aa.close();
    }
}
