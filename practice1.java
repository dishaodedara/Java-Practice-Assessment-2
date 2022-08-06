import java.util.*;
class Circle {
    private double radius;
    public final double PI = 3.14;
    Circle() {
        radius = 1;
    }
    Circle(double r) {
        radius = r;
    }
    public double getperimeter() {
        return PI * 2 * radius;
    }
    public double getarea() {
        return radius * radius * PI;
    }
}
public class Pr2_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area is " + c1.getarea() + " Perimeter is " + c1.getperimeter());
        Circle c2 = new Circle(5);
        System.out.printf("Area is " + c2.getarea() + " Perimeter is " + c2.getperimeter())
    }
}