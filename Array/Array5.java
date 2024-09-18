package Array;

public class Array5 
{
    public static void main(String[] args) 
    {
        int [] arr1 = {1,2,63,69 ,25};
        int [] arr2 = {6,7,18,69,10};
        for(int i = 0; i<arr1.length && i<arr2.length;i++)
        {
            if(arr1[i]>arr2[i])
            {
                System.out.println("Element at index "+i+" : "+arr1[i]+" is greater than "+arr2[i]);
            }
            else if(arr2[i]>arr1[i])
            {
                System.out.println("Element at index "+i+" : "+arr2[i]+" is greater than "+arr1[i]);
            }
            else
            {
                System.out.println("Element at index "+i+" : "+arr1[i]+" is equal to "+arr2[i]);
            }
        }
    }    
}
