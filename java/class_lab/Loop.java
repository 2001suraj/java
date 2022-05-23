package class_lab;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = aa.nextInt();
        int sum = 0;
            if(n%2!=0){
                for(int a =0;a<=n;a++){

                sum+=n;
                System.out.println( "The sum of first "+n+" odd number is " +sum );
            }
        }
            
            else{
                System.out.println(n+" even ");
            
        }
        aa.close();
    }
    
}
