package practice.two;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println(" enter the number");
        int a = aa.nextInt();
        int b,c=0,d;
        d =a;
        while(a>0){
            b =a%10;
            c = c + b*b*b;
            a = a/10;
        }
        a =d;
        if(a==c){
            System.out.println( a  + " armstrong number");
        }
        else{
            System.out.println( a +" not a armstrong number");
        }
        aa.close();
    }
}
