package classPractice;

abstract class Shape3 {
    abstract double area();

    void displayShapeType() {
        System.out.println("This is a shape.");
    }
}


class Circle3 extends Shape3 {
    double radius;

    Circle3(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    void displayShapeType() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle3 extends Shape3 {
    double length, width;

    Rectangle3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    void displayShapeType() {
        System.out.println("This is a Rectangle.");
    }
}

public class Day4_task2 {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Shape3 cir = new Circle3(5);
        Shape3 rect = new Rectangle3(4, 6);

        cir.displayShapeType();
        System.out.println("Area of Circle: " + cir.area());

        rect.displayShapeType();
        System.out.println("Area of Rectangle: " + rect.area());
    }
}
