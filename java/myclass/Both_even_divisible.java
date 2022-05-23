package myclass;

import java.util.Scanner;

public class Both_even_divisible {
    public static void main(String[]args){
        int a ;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number");
        a = ss.nextInt();
         if (a %5 == 0 )
             if (a % 2 ==0 ){
             System.out.println(" The number is divisible by 5 and even  ");
             }
            else{
                System.out.println("The number is divisible by 5 and odd ");
            }
         
        else  {
            if(a%2 ==0){
             System.out.println("The number is  not divisible by 5 and even");
         }
         else{
            System.out.println("The number is  not divisible by 5 and odd ");
         }
        }
        ss.close();
    }
}
