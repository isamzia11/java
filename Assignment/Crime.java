package Assignment;
import java.util.Scanner;
public class Crime 
{
    String crime_category;
    String crime_location;
    String crime_title;

    Crime(String crime_category, String crime_location, String crime_title)
    {
        this.crime_category = crime_category;
        this.crime_location = crime_location;
        this.crime_title = crime_title;
        this.display_crime_info();

    }
    public void display_crime_info()
    {
        System.out.println("-> Crime Category : "+crime_category);
        System.out.println("-> Crime Location : "+crime_location);
        System.out.println("-> Crime Title : "+crime_title);
    }
    public static void main(String[]args)
    {
        System.out.println(" ~~~ CRIME INVESTIGATION DEPARTMENT ~~~ ");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter The Number Of Crime Ids You Want To Enter : ");
            if (in.hasNextInt()) {
                int id = in.nextInt();
              in.nextLine();
                for (int i = 0; i < id; i++)
                {
                    System.out.println("Enter The Type of The Crime :");
                    String crime_category = in.nextLine();
                    System.out.println("Enter The Location Of The Crime : ");
                    String crime_location = in.nextLine();
                    System.out.println("Enter The Title Of The Crime : ");
                    String crime_title = in.nextLine();
                    System.out.println(" | Crime id no. " + (i + 1)+" | ");
                    Crime Cr = new Crime(crime_category, crime_location, crime_title);

                }
                System.out.println("~~~ THANKS FOR USING OUR SERVICE ! ~~~ ");
                System.out.println("~~~ REGARDS IMSCIENCES SECURITY DEPARTMENT ~~~");
                break;
            }
            else
            {
                System.out.println("Invalid Input ! enter a proper number ! ");
                in.nextLine();
            }
        }

    }
}
