package fundamental.normal;
import java.util.Scanner;
public class Multiple_table {
    public static void main(String[] args) {
        Scanner aa =  new Scanner(System.in);
        System.out.println("Enter the table number");
        int n = aa.nextInt();
        int b ;
        for (int a=1;a<=10;a++){
            b = n*a;
            System.out.println( "\n"+n+ " X " + a + " = "+b);
        }
        aa.close();
    }
}
