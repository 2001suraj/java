package lab.lab_3;

import java.util.Scanner;

public class Lab3_29 {
   public static void main(String[] args) {
       Scanner aa = new  Scanner(System.in);
       System.out.println("Enter numbner in English");
       String inputNum = aa.next();
       String nepaliFormat = " ";
       for(int i=0;i<inputNum.length();i++){
           if(inputNum.charAt(i)=='.'){
               nepaliFormat = nepaliFormat+".";
           }else{
               nepaliFormat = nepaliFormat+(char)(inputNum.charAt(i)+2358);
           }
       }  
       System.out.println("Numbers in Nepali : "+ nepaliFormat);
       aa.close();
   } 
}
