package Array;
import java.util.Arrays;
public class ReverseArray 
{
    public static void main(String[] args)
    {
        int [] data = {1,2,7};
        int[] dataR = reverseArray(data);
        System.out.println("Original Array : "+Arrays.toString(data));
        System.out.println("Reverse Array"+Arrays.toString(dataR));    
    }
    public static int[] reverseArray(int[] data)
    {
        int [] reversedData = new int[data.length];
        int i;
        for(i = 0; i< data.length;i++)
        {
            reversedData [i] = data[((data.length)-1-i)];
        }
        return reversedData;
    }
}
