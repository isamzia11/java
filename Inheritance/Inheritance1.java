package Inheritance;

class Base
{
    Base()
    {
        System.out.println("i am a base class constructor");
    }
    Base(int a)
    {
        System.out.println("Im an overloaded Base constructor with value of a as :"+a);
    }
}
class Derived extends Base
{
   Derived()
   {
    System.out.println("i am aderived class constructor ");
   }
   Derived(int x,int y)
   {
    super(x);
    System.out.println("i am an derived overloaded constructor with value of x as :"+x+" and value of y as :"+y);
   }
}
public class Inheritance1 
{
    public static void main(String[] args) {
        Derived obj = new Derived(2,8);
    }
}
