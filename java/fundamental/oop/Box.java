package fundamental.oop;
//     class Boxx {
//         double length;
//         double breadth;
//         double height;

//         double Volumn() {
//             double vol;
//             vol = length * breadth * height;
//             return vol;
//         }
//         double Area(){
//             double area;
//             area = length*breadth;
//             return area;
//         }
//     }

// public class Box{
//     public static void main(String[] args) {
//         double r ,a;
//         Boxx b =  new Boxx();
//         b.length = 10;
//         b.height= 5;
//         b.breadth=20;
//         r= b.Volumn();
//         a = b.Area();
//         System.out.println("Voulmn = "+ r);
//         System.out.println("Area = "+ a);

//     }
    
// }

class Car{
    String color;
    double  number;
    String model;  
   

    }

public class Box{
public static void main(String[] args) {
    Car v = new Car();
    v.color="red";
    v.model="6439kj";
    v.number=344;
    System.out.println("Color is :" + v.color );
    System.out.println("model is :" + v.model );
    System.out.println("number is :" + v.number );

    
}
}
