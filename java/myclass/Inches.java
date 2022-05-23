package myclass;
import java.util.Scanner;
public class Inches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measurement in inches");
        int inche = sc.nextInt();
        int a = inche / 12;
        int b = inche % 12;
        System.out.println(a + " ft " + b + " inches");
        sc.close();

    }
}
