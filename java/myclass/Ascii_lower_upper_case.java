package myclass;
import java.util.Date;
import java.util.Scanner;
public class Ascii_lower_upper_case {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("choose 1 for ascii value  choose 2 for ascii decimal");
        int num = a.nextInt(); 
        // using switch case for choosing ascii value and decimal   
        Date now =  new Date();
        System.out.println(now);  
        switch(num) { 
            
            case 1:
            System.out.println(" Enter the number");
            int b = a.nextInt();
            char ch1 = (char) b;
            if (ch1 >=65 && ch1 <=90){
                System.out.println(" upper case =>" + ch1);
            }
            else if (ch1 >= 97 && ch1 <= 122){
                System.out.println("lower case => " + ch1);
            }
            else{
                System.out.println("Not a alpha =>" + ch1);
            }
            break;

            case 2:
            System.out.println(" Enter the char");
             char c = a.next().charAt(0);
            
            if (c >=65 && c <=90){
                System.out.println(" ascii value => " + (int)c);
            }
            else if (c >= 97 && c <= 122){
                System.out.println("ascii value => " + (int)c);
            }
            else{
                System.out.println("don't have ascii value");
            }
            break;
            default:
            System.out.println("invalid number please enter 1 or 2");
            
        }  
            
        a.close();
    }
}
