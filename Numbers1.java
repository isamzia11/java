import java.io.*;
public class Numbers1
{
    public static void main(String[] args) throws IOException
    {
        int min=0, max = 0, x ,sum = 0, count = 0;
        boolean firstnumber = true;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("enter a number ");
            x = Integer.parseInt(in.readLine());
            if(x==0)
            {
            break;
            }
            if(firstnumber)
            {
                min = max = x;
                firstnumber = false;
            }
            sum+=x;
            if(x>max)
            {
                max = x;
            }
            if(x<min)
            {
                min = x;
            }
            count++;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+ sum/count);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
