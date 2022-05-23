package myclass;
import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args) {
        Scanner ss = new Scanner (System.in);
        System.out.println(" Enter the  raduis");
        double radius = ss.nextFloat();
        double pie = 22/7F;
        
        double a= Math.pow(radius,2);
        double final_area = pie * a; 
        System.out.println("The of circle is " + final_area);
        ss.close();


    }
}
