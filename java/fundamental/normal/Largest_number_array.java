package fundamental.normal;

import java.util.Scanner;

public class Largest_number_array {
    public static void main(String[] args) {

        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = aa.nextInt();
        int arry[] = new int[n];
        int i;
        int larg = arry[0];

        for (i = 0; i < n; i++) {
            System.out.printf("Enter the %d number \n", i + 1);
            arry[i] = aa.nextInt();
        
        }
        for(i=1;i<n;i++){
        if (larg < arry[i]) {

            larg = arry[i];
        }
    }
    
        System.out.println(larg + " is the largest number ");

    }
}
