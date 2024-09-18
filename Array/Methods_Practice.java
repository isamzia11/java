package Array;

public class Methods_Practice 
{
    public static void mul(int n)
    {
        for(int i =1; i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
    public static void pattern(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<i+1;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static int sumRec(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1; 
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
    public static int avg(int ... arr)
    {
        int sum = 0;
        int avg;
        for(int element:arr)
        {
            sum +=element;
        }
        avg = sum/arr.length;
        return avg;

    }
    public static void rec_pattern(int n)
    {
       if(n>0)
       {
        rec_pattern(n-1);
        for(int i = 0;i<n;i++)
        {
            System.out.print (" * ");
        }
        System.out.println(" ");
       }
    }
    public static void main(String[] args) 
    {
        mul(2);
        pattern(4);
       int a = sumRec(3);
       System.out.println("Sum of recursion = "+a);
       int b = fib(7);
       System.out.println("Sum of fibonacci series = "+b);
       System.out.println("average = "+avg(1,2,3,4,5));
       rec_pattern(4);
    }
}
