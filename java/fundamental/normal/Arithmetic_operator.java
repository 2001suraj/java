package fundamental.normal;

import java.util.Scanner;
public class Arithmetic_operator {
    public static void main(String[] args) {
        Scanner aa =  new Scanner(System.in);
        System.out.println(" Enter the first number");
        float first = aa.nextFloat();
        System.out.println(" Enter the first number");
        float second = aa.nextFloat();
        float a = first + second;
        float b = first - second;
        float c = first * second;
        float d = first / second;
        float e = first % second;
        System.out.println(" The sum is " + a + "\n The differnce is  " 
                            + b +"\n The multiple is  " + c +"\n The division is  "
                            + d +"\n The mode is  " + e );
        aa.close();
    }
}
