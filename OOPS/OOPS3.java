package OOPS;

class CellPhone
{
    public void ring()
    {
        System.out.println("ringing....");
    }
    public void vibrate()
    {
        System.out.println("vibrating....");
    }
    public void calling()
    {
        System.out.println("calling....");
    }
}
class Square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class OOPS3 
{
public static void main(String[] args)
{
    CellPhone obj = new CellPhone();
    obj.calling();
    obj.vibrate();    
    Square obj1 = new Square();
    obj1.side = 4;
    System.out.println(obj1.area());
    System.out.println(obj1.perimeter());


}  
    
}
