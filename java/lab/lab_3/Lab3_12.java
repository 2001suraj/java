package lab.lab_3;

import java.util.Scanner;

public class Lab3_12 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = aa.nextInt();
        for (int c = 1; c <= a; c++) {
            for (int j = 1; j <= c; j++) {

                     if((c+j)%2==0){
                         System.out.print("1");
                     }
                     else{
                         System.out.print("0");
                     }
        
            }
            System.out.println();
        }
        aa.close();
    }
}
