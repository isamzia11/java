package Abstraction;

public interface shape
{
    public double calculateArea();
}
class Square implements shape {
    private double side;
  
    public Square(double side) {
      this.side = side;
    }
  
    @Override
    public double calculateArea() {
      return side * side; // Implementation for Square
    }
  }
  class Circle implements shape {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    @Override
    public double calculateArea() {
      return Math.PI * radius * radius; // Implementation for Circle
    }
  }
  class Main{
    public static void main(String[] args) 
    {
        Square s = new Square(4);
        Circle c = new Circle(6);   
        
        System.out.println("Area of square :"+s.calculateArea());
        System.out.println("area of sqauare :"+c.calculateArea());
    }
  }
