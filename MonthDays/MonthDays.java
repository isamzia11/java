package MonthDays;
import java.util.Scanner;
public class MonthDays 
{
    int month;
    int years;
    MonthDays(int x,int y)
    {
        month = x;
        years = y;
    }    
    public int getnumberofdays()
    {
        if(month==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
        {
            return 31;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        if(month == 2){
            if(years % 100 == 0)
            {
                if (years % 400 == 0) 
                {
                    System.out.println("its a leap year");    
                    return 29;
                }
                else
                {
                    return 28;
                }
            }
            else
            {
                if(years % 4==0)
                {
                    System.out.println("its a leap year");
                    return 29;
                }
            }

        }
        return 28;
    }
}
