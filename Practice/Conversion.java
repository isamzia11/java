package Practice;
import java.util.Scanner;
public class Conversion 
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    System.out.println("enter kilometers");
    double km = input.nextDouble();
    System.out.println("kilometeres = "+km);
    System.out.println("Convert "+km+" kilometeres into Miles ");
    double miles = km * 0.621371;
    System.out.println("Miles = "+miles);
}    
}
