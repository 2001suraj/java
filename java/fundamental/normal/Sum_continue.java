package fundamental.normal;

public class Sum_continue {
    public static void main(String[] args) {
    int  a, sum=0;
    for(a=1;a<=100;a++){
        if(a==10 || a==88 || a==85){
            continue;
        }
        sum +=a;

    }
        System.out.println( "The sum is "+sum);
    
    }
}
