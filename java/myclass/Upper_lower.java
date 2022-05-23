package myclass;

import java.util.Scanner;

public class Upper_lower {

    public static void main(String[] args) {
        char cc;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the character");
        cc = ss.next().charAt(0);
        if (cc >= 'A' && cc <= 'Z') {
            System.out.println(cc + " is  an upper case");
        } else if (cc >= 'a' && cc <= 'z') {
            System.out.println(cc + " is  an lower case");
        } else {
            System.out.println(cc + " other character");
        }
        ss.close();

    }
}
