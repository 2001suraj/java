package myclass;
import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println(" Enter the year to check the year is leap year or not :");
        int year = aa.nextInt();
        if ( year % 4 == 0){
            System.out.println(" The year is leap year");
        }
        else{
            System.out.println(" The year is not leap year");
        }
        aa.close();

    }
}
