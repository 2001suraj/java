package lab.lab_3;

import java.util.Scanner;

public class Lab3_20 {
    public static void main(String[] args) {
        Scanner aa =new Scanner(System.in);
        String finalnumber = "";
        System.out.println("Enter the number");
        String n  =aa.nextLine();
        int count =0;
        StringBuilder strn = new StringBuilder(n);
        strn.reverse();
        for(int i =0; i<n.length();i++){
            char ch = strn.charAt(i);
            finalnumber = finalnumber +ch;
            count++;
            if(count !=1 && (count%2)!=0){
                if(count ==strn.length()){
                    break;
                }
                finalnumber = finalnumber +",";
            }
        }
        StringBuilder result = new StringBuilder(finalnumber);
        // result.reverse();
        System.out.println(result.reverse());

    }
}
