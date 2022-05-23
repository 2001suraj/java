// a = 5 ,b =1, c =3
package practice.two;
import java.util.Scanner;
public class Sorting_number {
    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);
        System.out.println(" Enter the value of a");
        int a = ss.nextInt();
        System.out.println(" Enter the value of b");
        int b = ss.nextInt();
        System.out.println(" Enter the value of c");
        int c = ss.nextInt();
        int d;
        if (a>b ){
            d = a;
            a=b;
            b=c;
            System.out.println("The value of a :" + a+ "\nThe value of b : " + b );
        }

         if(b>c ){
            d = b;
            b=c;
            d=c;
            System.out.println("The value of b :" + b+ "\nThe value of c: " + c );
        }

        if(c>a){
            d = c;
            c=a;
            a=c;
            System.out.println("The value of b :" + b+ "\nThe value of c: " + c );
        }
        ss.close();
    }
}
