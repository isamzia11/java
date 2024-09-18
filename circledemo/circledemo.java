package circledemo;

public class circledemo 
{
public static void main(String[] args) {
    circle c1 = new circle();
    circle c2 = new circle();
    c1.SetRadius(2.5);
    c1.CalcCircum();
    c1.GetArea();
    c1.PrintCircleInfo(1);

    c2.SetRadius(7.5);
    c2.CalcCircum();
    c2.GetArea();
    c2.PrintCircleInfo(2);
}    
}
