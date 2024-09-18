import java.util.Scanner;

public class Percentage 
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    int t_marks = 500;
    int Sum = 0;
    double per;
    System.out.println("Enter marks for 5 Subjects");
    for(int i = 1; i<=5; i++)
    {
       int a = input.nextInt();
        Sum += a;
    }
    System.out.println("Sum = "+Sum);
    per = (double)Sum/t_marks * 100;
    System.out.println("Percentage = "+per);
}    
}
