package practice.two;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner a  = new Scanner(System.in);
        System.out.println("Enter the number");
        int ac = a.nextInt();
        int r,s=0 ,num;
        num = ac;
        while(num>0){
            r = num % 10;
            s = r + s*10;
            num = num/10;
        }
        System.out.println(" The reverse is " + s);
        if (s == ac){
            System.out.println(" It is palindroem");
        }
        else{
            System.out.println("It is not palindroem");
        }
        a.close();
    }
}
