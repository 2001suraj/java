package lab.lab_3;

import java.util.Scanner;

public class Lab3_25 {
    public static void main(String[] args) {
        int pin = 1234;
        int totalAtt = 3;
        int currentAtt = 0;
        int remainningAtt = totalAtt - currentAtt;
        Scanner aa = new Scanner(System.in);
        while (currentAtt != totalAtt) {
            System.out.println("Enter the pin \n");

            int userPin = aa.nextInt();
            if (userPin == pin) {
                System.out.println("correct\n");
                break;
            } else {
                currentAtt++;
                remainningAtt = totalAtt - currentAtt;
                System.out.println("Sorry, your pin is incorrect you have " + remainningAtt + " attempt  left\n");
                if (remainningAtt == 0) {
                    System.out.println("Your all attempt is fail, please try again after   Sec\n");

                }
            }
        }

        aa.close();

    }
}
