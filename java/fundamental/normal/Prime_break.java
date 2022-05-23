package fundamental.normal;

import java.util.Scanner;

public class Prime_break {
    public static void main(String[] args) {
        try (Scanner aa = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = aa.nextInt();
            int a;
            for (a = 2; a <= n; a++) {
                if (n % a == 0) {
                    break;
                }

            }
            if (a == n) {
                System.out.println(" prime number");
            } else {
                System.out.println(" not a prime number");

            }
            aa.close();
        }

    }
}
