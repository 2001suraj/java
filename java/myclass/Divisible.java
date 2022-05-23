package myclass;
import java.util.Scanner;
public class Divisible {
    public static void main(String[]args){
        int a ;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number");
        a = ss.nextInt();
         if (a %5 == 0){
             System.out.println(" The number is divisible by 5");
         }
         else{
             System.out.println("The number is  not divisible by 5");
         }
         ss.close();

    }
}
