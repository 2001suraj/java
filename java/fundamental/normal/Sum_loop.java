package fundamental.normal;
import java.util.Scanner;
public class Sum_loop {
    public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        System.out.println("Enter the  start number to add from");
        int  i = a.nextInt();
        System.out.println("Enter the  end number ");
        int  j = a.nextInt();
        // double ii = Math.pow(i,2);
        // int i1 = i*i;
           int  sum = 0;
        while(i<=j){
            sum=  sum + i*i;
            i++;
        }
        System.out.println(sum) ;
    a.close();
    }
}
