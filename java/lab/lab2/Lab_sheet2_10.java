package lab.lab2;
import java.util.Scanner;
import java.lang.Math;
public class Lab_sheet2_10 {
    public static void main(String[] args) {
        Scanner ab  = new Scanner (System.in);
        System.out.println(" Enter \n1 for area of rectangle \n2 for circle and \n3 for square");
        int num = ab.nextInt();
        switch (num){
            case 2 :
                System.out.println(" Enter the  raduis");
                double radius = ab.nextFloat();
                double pie = 22/7F;
                
                double a= Math.pow(radius,2);
                double final_area = pie * a; 
                System.out.println("The of circle is " + final_area);
                break;
                case 1:
                System.out.println("Enter the length");
                float length = ab.nextFloat();
                
                System.out.println("Enter the breadth");
                float breadth = ab.nextFloat();
                float area = length * breadth;
                System.out.println(" The area of rectangle = " + area);
                break;
                case 3:
                System.out.println(" Enter the  length");
                double length1 = ab.nextFloat();
                String b = ab.nextLine();
                double area1 = length1 * length1;
                
                System.out.println("The area of rectangle is " + area1 +b+ "."  );
                default:
                System.out.println(" Invalid entry, please enter(1,2,3)only ");
        }
        ab.close();
    }

}
