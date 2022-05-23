package lab.lab2;

import java.util.Scanner;

public class Lab2_25 {
   public static void main(String[] args) {
       Scanner aa =new Scanner(System.in);
       System.out.println("Enter the number");
       int a =aa.nextInt();
       String  f;
       f =(a%2==0)?"Even":"Odd";
       System.out.println(a+" is "+f);
aa.close();
   } 
}
