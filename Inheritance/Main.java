package Inheritance;

public class Main 
{
    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle myCircle = new Circle("Red", 5.0);

        // Accessing inherited attribute
        myCircle.displayColor();

        // Accessing subclass attribute
        System.out.println("Radius of the circle: " + myCircle.radius);

        // Invoking subclass method
        System.out.println("Area of the circle: " + myCircle.calculateArea());
    }
}
class Shape {
    // Attribute
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Method
    void displayColor() {
        System.out.println("Color of the shape: " + color);
    }
}
class Circle extends Shape {
    // Additional attribute
    double radius;

    // Constructor
    public Circle(String color, double radius) {
        // Call superclass constructor
        super(color);
        this.radius = radius;
    }

    // Method
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
