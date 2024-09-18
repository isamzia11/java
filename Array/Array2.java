package Array;

public class Array2 
{
 static int [] a = {1 ,2 ,3 ,4 ,5};
    public static void main(String[] args) 
    {
        for(int i = 0;i<a.length;i++)
        {
        System.out.println("array a ="+a[i]);    
        }
        System.out.println("now reversing the Array");
        for(int i = a.length-1;i>=0;i--)
        {
            System.out.println("array a ="+a[i]); 
        }
        System.out.println("now using for each loop method");
        for(int element : a)
        {
            System.out.println(element); 
        }
    }

}
