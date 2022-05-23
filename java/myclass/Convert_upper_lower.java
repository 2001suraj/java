package myclass;
import java.util.Scanner;
public class Convert_upper_lower {
    
    public static void main(String[] args ){
        Scanner ss = new Scanner(System.in);
        char aa ,ab;
        System.out.println("Enter the character in lower case");
        aa = ss.next().charAt(0);
        ab = Character.toUpperCase(aa);
      
        System.out.println(" The upper case is  : " + ab);
        ss.close();

    } 
}
