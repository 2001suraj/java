package lab.lab4;

public class Lab19 {
    static void reverseString( String ss){
         String aa ="";
        for(int i =ss.length()-1;i>=0;i-- ){
            aa += ss.charAt(i);
        }
        System.out.println(aa);
   }
    public static void main(String[] args) {
        String name = "RADHA";
        reverseString(name);
    }
}
