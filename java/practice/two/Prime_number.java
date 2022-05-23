package practice.two;
import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        boolean c = false;
        System.out.println(" Enter the number to check prime or not");
        int a  = aa.nextInt();
        for(int i =  2 ;i<a/2;i++){
            if (a%i == 0 ){
            c = true;
            break;
        }
    } 
        if (!c )
            System.out.println(a +" is the  prime number");
        
        else
    
        System.out.println( a +" is not prime number");
    
        
        aa.close();
    }
}
