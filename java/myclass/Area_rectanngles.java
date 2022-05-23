package myclass;

import java.util.Scanner;
public class Area_rectanngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        float length = sc.nextFloat();
        
        System.out.println("Enter the breadth");
        float breadth = sc.nextFloat();
        float area = length * breadth;
        System.out.println(" The area of rectangle = " + area);
        sc.close();
  
    }
}
