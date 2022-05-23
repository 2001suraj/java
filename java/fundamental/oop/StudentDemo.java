package fundamental.oop;

// student class
class Student {
    String name;
    int age;
    double marks;
    double sub;

    public Student(String n, int a, double m, int subject) {
        name = n;
        age = a;
        marks = m;
        sub = subject;
    }

    double per() {
        double perc = marks * sub / 100;
        return perc;
    }

    // making function to display
    void display() {
        System.out.println("\nName  : " + name + " \nAge   : " + age + "\nmarks : " + marks + "\nSubjects :" + sub);
    }
}

public class StudentDemo {
    // main class
    public static void main(String[] args) {
        Student aa = new Student("Ram", 10, 302.23, 6);

        aa.display();
        double score3 = aa.per();
        System.out.println("percentage is "+ score3);
        // making object
        Student p = new Student("Sita", 298, 71267.2, 6);
        p.display();
        double score = p.per();
        System.out.println("percentage is "+ score);
        // making another object
        Student q = new Student("hari", 23, 2312.2, 6);
        q.display();
        double score1 = q.per();
        System.out.println("percentage is "+ score1);
    }
}
