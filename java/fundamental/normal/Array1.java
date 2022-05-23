package fundamental.normal;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        
        Scanner aa = new Scanner(System.in);
        int age[] = new int[5];
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the age of %d Student :", i + 1);

            age[i] = aa.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("The age of %d student  is :",i+1);
            System.out.println(age[i]);
            
        }
        aa.close();
    }
}
