package Methods;

public class Overloading2 
{
    static int length;
    static int width;
    public static int Area_of_rectangle(int length,int width)
    {
        return length*width;
    }
   
    public static double Area_of_rectangle(int length,double width)
    {
        return length*width;
    }

    public static double Area_of_rectangle(double length,int width)
    {
        return length*width;
    }   
}
