package fundamental.normal;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
    Scanner aa = new Scanner(System.in);
    System.out.println(" Enter the first number");
    int first = aa.nextInt();
    System.out.println(" Enter the second number");
    int second = aa.nextInt();
    if(first > second){
        System.out.println(" First number is greater than second number");
    }
    else if(first == second){
        System.out.println("First number is equal second number");
    }
    else{
        System.out.println(" Second number is greater than first number");
    }
        aa.close();
    }
}
