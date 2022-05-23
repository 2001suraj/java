package practice.one;
import java.util.Scanner;
public class Input_your_address {
   public static void main(String [] args) {
    System.out.println("Enter your address");
    Scanner address = new Scanner(System.in);
    String add = address.next();
    System.out.println(" Your address is  : " + add );
    address.close();

   }
}
