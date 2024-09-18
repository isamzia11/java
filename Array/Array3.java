package Array;
import java.util.Scanner;
public class Array3 
{
    static int [] num = new int[5];
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int f = 10;
        boolean isinArray = false;
        System.out.println("enter elements in Array :");
        for(int i = 0;i<num.length;i++)
        {
            int a = in.nextInt();
            num[i] = a;
        }
        System.out.println("the Array contains the following elements :");
        for(int i= 0 ; i<num.length;i++)
        {
            System.out.println(num[i]);
        }
        for(int element:num)
        {
            if(f==element)
            {
                isinArray = true;
                break;
            }
        }
        if(isinArray){
            System.out.println("the value is in Array");
        }
        else{
            System.out.println("the value is not in Array");
        }
    }
    
}
