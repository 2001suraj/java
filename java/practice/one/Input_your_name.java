package practice.one;
import java.util.Scanner;
public class Input_your_name {
    public static void main (String [] args ){
        System.out.println(" What is your name ?");
        Scanner Sc = new Scanner( System.in);
        String name = Sc.next();
        System.out.println("  Your name is " + name);
        
Sc.close();
    }
}
