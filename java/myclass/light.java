package myclass;
public class light {
    public static void main(String[] args) {
        // variable declaration
        int lightspeed;
        long days;
        long second;
        long distance;
        // varible initialization
        lightspeed = 186000;
        days = 1000;
        second = days * 24 * 60 * 60;
        distance = lightspeed * second;
        System.out.println("Distance travel by light in " + second + " is " + distance);

    }
}
