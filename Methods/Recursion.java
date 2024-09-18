package Methods;
import java.util.Scanner;
public class Recursion
{
    public static int factorial(int x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
    public static int factorial_iterative(int x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i<=x;i++)
            {
                product*=i;
            }
            return product;
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        System.out.println("factorial of "+n+" = "+factorial(n));
        System.out.println("factorial = "+factorial_iterative(n));    
    }    
}
