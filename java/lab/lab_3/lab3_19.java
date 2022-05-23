package lab.lab_3;
import java.util.Scanner;
public class lab3_19 {
    public static void main(String[] args) {
        Scanner aa =new Scanner(System.in);
        System.out.println("Enter the floating point number");
        double n1 = aa.nextDouble();
        System.out.println("Enter the value for precision");
        int p = aa.nextInt();
        int j =1;
        for(int i=0;i<p;i++){
            j = j*10;
        } 
        float value = (int)(n1*j+0.5);
        value = value/j;
        System.out.println("value: "+ value);
        aa.close();       
        }
}
