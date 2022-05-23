package myclass;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner ss = new Scanner (System.in);
        System.out.println(" Enter the  length");
        double length = ss.nextFloat();
        String a = ss.nextLine();
        double area = length * length;
        
        System.out.println("The area of rectangle is " + area +a+ "."  );
        ss.close();

    }
}
