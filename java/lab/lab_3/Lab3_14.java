package lab.lab_3;

import java.util.Scanner;

public class Lab3_14 {
  public static void main(String[] args) {
      Scanner aa =new Scanner(System.in);
      System.out.println("Enter the number");
      Long n = aa.nextLong();
      int c=0;
      for(int a =1;a<=n;a++){
          if(n<=9999999999l){
            n = n/10;
            c++;
          }
      }
      System.out.println(c);
      aa.close();
  }  
}
