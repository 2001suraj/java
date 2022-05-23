package lab.lab_3;

import java.util.Scanner;

public class lab3_6 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the table number");
        int n  = aa.nextInt();
        for(int a =0;a<=10;a++){
            int b = a*n;
            System.out.println(a + " X "+ n+" = "+b);
        }
        aa.close();
    }
}
