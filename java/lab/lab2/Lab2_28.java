package lab.lab2;
import java.util.Scanner;
public class Lab2_28 {
    public static void main(String[] args) {
        Scanner aa =new Scanner(System.in);
        System.out.println("Enter the year");
        int a = aa.nextInt();
        String z ;
        z =(a%4==0)?"Leap year":"Not Leap year";
        System.out.println(a +" is "+z);

    }
}
