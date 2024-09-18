package Methods;

public class MethodsOverLoading 
{
    public static void main(String[] args)
    {
        MethodsOverLoading obj = new MethodsOverLoading();
        int a = add(1, 2);
        int b = add(1, 2, 3);
        int c = add(1, 2, 3, 4); 
        System.out.println("sum1 = "+a);
        System.out.println("sum2 = "+b);
        System.out.println("sum3 = "+c);
    }   
    public static int add(int a, int b)
    {
        return a+b;
    } 
    public static int add(int a, int b,int c)
    {
       
        return a+b+c;
    } 
    public static int add(int a, int b,int c,int d)
    {
        return a+b+c+d;
    } 
}
