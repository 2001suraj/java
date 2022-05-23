package myclass;

import java.util.Scanner;

import java.lang.Math;

public class Area_triangle {
    public static void main(String[] args) {
        double s, a, b, c, area, final_area, perimeter;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side 1");
        a = sc.nextDouble();

        System.out.println("Enter the side  2");
        b = sc.nextDouble();

        System.out.println("Enter the side 3");
        c = sc.nextDouble();

        perimeter = a + b + c;
        s = perimeter / 2;

        area = s * (s - a) * (s - b) * (s - c);
        final_area = Math.pow(area, 0.5);

        System.out.println(" Area  : " + final_area + "\n" + "perimeter : " + perimeter);
        sc.close();
    }
}
