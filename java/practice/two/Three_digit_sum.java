// input  = 123 > the output should be : 1+2+3 =6
package practice.two;
import java.util.Scanner;
public class Three_digit_sum {
    public static void main(String[] args) {
        int num ,sum= 0, a;
        Scanner ss = new Scanner(System.in);
        System.out.println(" Enter the 3 digit  number");
        num = ss.nextInt();
        while (num >0){
            a = num%10;
            sum += a;
            num = num/10;
        }
        System.out.println(" The sum of " + num + "is "+ sum);
        ss.close();
    }
}
