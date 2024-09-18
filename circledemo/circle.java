package circledemo;

public class circle 
{
    // Class level Variables, Member variables, Fields, Properties, Attributes, Instance Variables
 private double radius;
 private double circum;
 private double area; 

 public circle()
 {
    radius = 1.0;
    circum = 1.0;
    area = 1.0;
 }

 public void SetRadius(double s)
 {
    if (s>0)
    {
    radius = s;
    }
    else
    {
        radius = 0.0;
    }
 }   
 public void CalcCircum()
 {
    circum = 2 * 3.147 * radius;
 }
public void GetArea()
{
area = 3.147 * radius * radius;
} 
void PrintCircleInfo(int c)
{
System.out.println("Circle - "+c+" - Information");
System.out.println("Radius :"+radius);
System.out.println("Circumference : "+circum);
System.out.println("Area :"+area);
}
}
