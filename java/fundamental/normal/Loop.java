package fundamental.normal;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter how many times do you want to print :");
        int a =  aa.nextInt();
        System.out.println("");
        
        while(a>0){
            System.out.println(a);
            a--;
        }
        aa.close();
    }
}
