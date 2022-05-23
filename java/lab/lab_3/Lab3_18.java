// upper : ch1 >=65 && ch1 <=90
//lower :ch1 >= 97 && ch1 <= 122
//Number :  48-57
package lab.lab_3;

import java.util.Scanner;

public class Lab3_18 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String n = aa.next();
        int upper = 0, lower = 0, number = 0, special = 0;
        for (int i = 0; i < n.length(); i++) {
            char nn = n.charAt(i);
            if (nn >= 'A' && nn <= 'Z') {
                System.out.printf("\n %s is upper case", nn);

                upper++;
            } else if (nn >= 'a' && nn <= 'z') {
                System.out.printf("\n %s is lower case", nn);

                lower++;
            } else if (nn >= '0' && nn <= '9') {
                System.out.printf("\n %s is number ", nn);

                number++;
            } else {
                System.out.printf("\n %s is special character", nn);

                special++;
            }

        }
        System.out.println("\nThe upper case :" + upper + "\nThe lower case is : " + lower + " \nThe number is : "
                + number + " \n Special " + special);
        aa.close();
    }
}
