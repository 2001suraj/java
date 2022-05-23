package lab.lab2;

import java.util.Scanner;

public class Lab_2_19 {
    public static void main(String[] args) {
        int class_held, no_class_attended;
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number of class held");
        class_held = aa.nextInt();
        System.out.println("enter the number of class attended ");
        no_class_attended = aa.nextInt();
     
        float perc = class_held * no_class_attended / 100;
        if (perc < 75) {
            System.out.println( "The percantage of class attended is  "+perc + "%. So,the student can not sit in exam hall");
        } else {
            System.out.println("The percantage of class attended is  "+perc +" % .So, the student can sit in exam hall");
        }
        aa.close();
    }
}
