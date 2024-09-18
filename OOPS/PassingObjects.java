package OOPS;

import java.util.Scanner;

public class PassingObjects 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(10, 12);
        Rectangle r2 = new Rectangle(7, 4);
        r1.CalcArea();
        r1.PrintRectangle();
        ModifyRect(r1);    
        System.out.println("after modification ");
        r1.PrintRectangle();
    }    
    public static void ModifyRect(Rectangle tmp)
    {
        Scanner kb = new Scanner(System.in);
        double L,W;                                 // we can also return the object
        System.out.println("Enter New Length ");
        L = kb.nextDouble();
        W = kb.nextDouble();
        tmp.setData(L, W);
        tmp.CalcArea();
        
        

    }
}
class Rectangle 
{
    private double length;
    private double width;
    private double area;
    public Rectangle(double l, double w){
        length = l;
        width = w;
        area = 0.0;
    }
    public void setData(double l,double w){
        length = l;
        width = w;
    }    
    public void CalcArea()
    {
        area = length * width;
    }
    public void PrintRectangle()
    {
        System.out.println("length :"+length);
        System.out.println("width :"+width);
        System.out.println("area :"+area);
    }
    public void AddReacts(Rectangle tmp)
    {
        double gL, gW;
        gL = length + tmp.length;
        gW = width + tmp.width;
    }
}


