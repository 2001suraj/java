package lab.lab_3;
import java.util.Scanner;
public class Lab3_5 {
    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);
        System.out.println("enter the number");
        int n = aaa.nextInt();
        
        for(int a= 1; a<=n;a++){
            int r = a*a*a;
            System.out.println("Number is :"+a+" and cube of "+a+" is : "+r);
        }
        aaa.close();
    }
}
