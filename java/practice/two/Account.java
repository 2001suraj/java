package practice.two;

public class Account {
    public static void main(String[] args) {
        String s1 = " Hello world";
        System.out.println(s1);
        for (int c = s1.length() - 1; c >= 0; c--) {
            System.out.print(s1.charAt(c));
        }

    }
}