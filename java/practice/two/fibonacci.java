package practice.two; 
// fibonacci = 0 1 1 2 3 5 8 13 21 34
public class fibonacci {
    public static void main(String[] args) {
        int a, b,c,i;
        a = 0;
        b = 1;
        
        System.out.print(a +" "+ b );
        for( i = 2; i < 10;i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
