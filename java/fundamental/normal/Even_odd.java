package fundamental.normal;


import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in); 
        System.out.println("Enter the number");
        int a = aa.nextInt();
        if (a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        aa.close();
    }
}
