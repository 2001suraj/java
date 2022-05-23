package practice.one;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the raduius");
        float radius = ss.nextFloat();
        float pie = 3.14F;
        float area = pie * radius * radius;
        System.out.println("The area is circle  = " + area);
        ss.close();

    }
}
