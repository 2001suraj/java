package lab.lab_3;

import java.util.Scanner;

public class Lab_3_7 {
    public static void main(String[] args) {
        int i = 1, num, count = 0, sum = 0;
        Scanner nn = new Scanner(System.in);
        System.out.println("Enter the number of term");
        num = nn.nextInt();
        System.out.println("The odd number are : ");
        while (count != num) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
            i++;
        }
        System.out.println("sum= " + sum);
        nn.close();
    }
}
