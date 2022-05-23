package lab.lab4;
import java.util.Scanner;
public class Lab20 {
    public static String replace (String str){
        String Character = "";
        for(int i = 0; i <str.length();i++){
            char ch =str.toLowerCase().charAt(i);
            if(ch =='a'|| ch=='e'|| ch =='i'||ch =='o'||ch=='u'){
                Character += (char)(str.charAt(i)+1);
            }else{
                Character += (char)(str.charAt(i));
            }
            return "Expected result : "+ Character;
        
        }
        return Character;
    }
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter any string ");
    }
}
