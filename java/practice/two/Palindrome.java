package practice.two;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String real, opp = "";
        Scanner aa = new Scanner(System.in);
        System.out.println(" Enter the number");
        real = aa.nextLine();
        int length = real.length();
        for (int i = length-1; i >= 0; i--) {
            opp = opp + real.charAt(i);
        }
        if (real.equals(opp)) {
            System.out.println(" It is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        
        aa.close();
    }

}
