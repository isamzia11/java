package Array;
import java.util.Scanner;
public class Arrayprog1 
{
        public static void main(String[] args)
        {
            int [] values = new int [5];
            int i, sum = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("enter five numbers :");
            //System.out.println();
            for (i=0;i<values.length;i++)
            {
                values[i] = in.nextInt();
            }
            for(i=0; i<values.length;i++)
            {
                sum = sum + values[i];
            }
            System.out.println("Sum of values = "+sum);

        }
}
