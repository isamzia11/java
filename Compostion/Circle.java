package Compostion;

public class Circle 
{
    Operation op;
    
    public Circle()
    {
        this.op = new Operation();
    }
    public void area(double radius)
    {
        System.out.println("the area is :"+3.14*op.square(radius));
    }
    public static void main(String[] args)
    {
        Circle obj =new Circle();
        obj.area(5);
    }

}
class Operation
{

    public double square(double n){
        return n*n;
    }
}
