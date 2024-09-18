package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array4 
{
    public static void main(String[] args) 
    {   Array4 obj = new Array4();
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int temp;
       int n = Math.floorDiv(l, 2);
       System.out.println("division = "+n);
       for(int i = 0 ;i<n;i++)
       {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
         
       }
       System.out.println("reversing the array through");
       for(int element:arr)
       {
        System.out.print(element+" ");
       }
       System.out.println(" ");
       obj.Max();
       obj.Min();
       obj.Sorted();

    }  
    public void Max()
    {
        int [] arr = {1,2,3,4,5};
        int max = 0;
        for(int element:arr)
        {
            if(element>max)
            {
                max = element;
            }

        }
        System.out.println("max element = "+max);
    }  
    public void Min()
    {
        int [] arr = {1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        for(int element:arr)
        {
            if(element<min)
            {
                min = element;
            }

        }
        System.out.println("min element = "+min);
    }
    public void Sorted()
    {
        int [] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for(int i = 0; i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted = false;
                break;
            }
        } 
        if(isSorted)
        {
            System.out.println("the Array is sorted");
        }
        else
        {
            System.out.println("the Array is not Sorted");
        }
    }
}
