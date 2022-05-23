package myclass;
import java.util.Scanner;
public class Chara_class {
    public static void main(String[] args) {
        // char ch = 'G', ch1;
        // System.out.println(ch);
    System.out.println("Enter the ascii value");
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        char ba =(char) a;
        System.out.println(ba);
        char ch1 = 122  ;
        System.out.println(ch1);
        aa.close();
    }
}
