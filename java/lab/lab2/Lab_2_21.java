package lab.lab2;

import java.util.Scanner;
public class Lab_2_21 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the vlaue of a");
        float a  = aa.nextFloat();
        System.out.println("Enter the vlaue of b");
        float b  = aa.nextFloat();
        System.out.println("Enter the vlaue of c");
        float c = aa.nextFloat();
        if(b*b<4*a*c){
            System.out.println("Is a imaginary");
        }
        else if(b*b>4*a*c){
            
            System.out.println("Is a real");
        }
        else{
            System.out.println(" Is not an equation");
        }
        aa.close();
    }
}
