package lab.lab_3;

import java.util.Scanner;

public class lab3_10 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number");
        int a  = aa.nextInt();
        int k =1;
        for(int i=1;i<=a;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        aa.close();
    }
}
