package lab.lab_3;

import java.util.Scanner;

public class Lab3_8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number");
        int b = a.nextInt();

        for(int c =1;c<=b;c++){
            for(int j=1;j<c;j++){
                
                System.out.print( j+" ");
            }
        System.out.println("");

        }
        a.close();
    }
}
