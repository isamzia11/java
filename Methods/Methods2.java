package Methods;

public class Methods2 
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        change(arr);
        System.out.print("Array = ");
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
    public static void change(int []arr)
    {
        arr[0] = 90;
    }  
} 

