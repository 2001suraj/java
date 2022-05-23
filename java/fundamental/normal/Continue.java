package fundamental.normal;
;

public class Continue {
    public static void main(String[] args) {
        int a;
        for( a=1;a<=6;a++){
            if(a==3 || a==5){
                continue;
            }
            System.out.println(a);
        }
    }
}
