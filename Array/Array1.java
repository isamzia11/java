package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] score = new int[5];
        System.out.println("enter subject marks :");
        for(int i = 0; i<5;i++)
        {
            int marks = in.nextInt();
            score[i] = marks;   
        }
       double total = Arrays.stream(score).sum();
        System.out.println("total marks : "+total);
        double per = (total/500) * 100;
        System.out.println("perentage = "+per);
    }    
}
