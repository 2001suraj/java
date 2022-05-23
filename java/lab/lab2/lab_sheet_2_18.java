package lab.lab2;

import java.util.Scanner;

public class lab_sheet_2_18 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number  of days");
        int n = aa.nextInt();
        
        
            switch(n%7){
                case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 0:
                System.out.println("Saturday");
                
                break;
                default:
            

                System.out.println("Invalid number");

                
            }
        
        
            aa.close();
        }
}
