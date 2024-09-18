package MonthDays;
import java.util.Scanner;
public class MonthDays2 
{
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter month ");
         int month = input.nextInt();

         System.out.println("enter year ");
         int years = input.nextInt();

         MonthDays monthDays = new MonthDays(month, years);
         int numberofdays = monthDays.getnumberofdays();
         System.out.println(numberofdays+" days");
    }    
}
