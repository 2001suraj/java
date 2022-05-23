package lab.lab2;
import java.util.Scanner;
public class Lab_2_20 {
    public static void main(String[] args) {
        int class_held, no_class_attended;
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the number of class held");
        class_held = aa.nextInt();
        System.out.println("enter the number of class attended ");
        no_class_attended = aa.nextInt();
        if(class_held>no_class_attended){
            System.out.println("If you have medical casue, press y or N if you don't have medical casuse.");
            char cc = aa.next().charAt(0);
        
            float perc = class_held * no_class_attended / 100;
            
                if(cc == 'y'){
                    if (perc < 75) {
                        System.out.println( "You have medical cause and your  percantage of class attended is  "+perc + "%. So,the student can  sit in exam hall");
                    } else {
                        System.out.println(" The percantage of class attended is  "+perc +" % .So, the student can sit in exam hall");
                    }
                }
                else if(cc=='N'){
                    if (perc < 75) {
                        System.out.println( " The percantage of class attended is  "+perc + "%. So,the student can not sit in exam hall");
                    } else {
                        System.out.println("The percantage of class attended is  "+perc +" % .So, the student can sit in exam hall");
                    }
                }
                else{
                    System.out.println("Invalid entry, please  press y or N for result");
                }
            }
            else{
                System.out.println("Number of class held is greater that number of class you have attended so please provide valid number of day .");
            }
            
        aa.close();
    }
}
