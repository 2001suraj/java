import java.util.Scanner;

public class aa{
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Your Marks:");
        int marks = ss.nextInt();
        if(marks<=100&&marks>90){
            System.out.println("AA");
        }
        else if(marks>80){
            System.out.println("AB");
        }
        else if(marks>70){
            System.out.println("BB  ");
        }
        else if(marks>60){
            System.out.println("BC");
        }
        else if(marks>50){
            System.out.println("CC");
        }
        else if(marks>40){
            System.out.println("CD");
        }
        else if(marks>30){
            System.out.println("DD");
        }
        else if(marks<=30 && marks>=0){
            System.out.println("FF");
        }
        else{
            System.out.println("Invalid marks");
        }
        ss.close();
    }
}