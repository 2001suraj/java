package practice.two;
import java.util.Scanner;
public class Vowel_0r_Conso {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter the character to check");
        char cc = aa.next().charAt(0);
            switch(cc){
                case 'a' :
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'O':
                case 'U':
                case 'o':
                case 'u' :
                System.out.println(cc+" is a vowel ");
                break;
                default:
                    if (cc >=65 && cc <=90 || cc >= 97 && cc <= 122){ 
                        System.out.println(cc + " is a consonant");
                    }else{
                        System.out.println( cc + " : Invalid Entry , please enter a-z or A-z only");
                    }          
          }
        aa.close();
    }
}
// 