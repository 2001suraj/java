package practice.two;
import java.util.Scanner;
public class Ternary_operator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        System.out.println("Enter the third number");
        int c =s.nextInt();
        int max = 0;
 
        max = (a >b  && a>c)?a:(b >a  && b>c)?a:c;



        System.out.println(max+" is the largest number among three number");
  

s.close();
    }
}
