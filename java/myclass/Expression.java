package myclass;
public class Expression {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 25;
        b = 23;
        c = 10;
        d = 33;
        float aa = a + b / c * d;
        float ab = c * d / b + a;
        float ac = c % 4 + d / 10;
        float ad = c % 4 + d / 10;
        System.out.println(" a+b/c*d= " + aa + "\nc*d/b+a = " + ab +"\nc % 4 + d / 10 = " +ac + ad);

    }
}
