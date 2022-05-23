package fundamental.normal;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter how many  humnber do you want to print even number");
        int n = aa.nextInt();
        System.out.println("\nEven number are : \n");
        
        while (n <= 100) {
            if (n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is odd");
            }
            n++;
        }
        aa.close();
    }
}
