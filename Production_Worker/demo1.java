package Production_Worker;

import java.util.Scanner;

public class demo1 
{
public static void main(String[] args) {
    String E_name;
    String E_number = null;
    int day;
    int month;
    int year;
    Date Hd;
    int shift;
    double H_rate;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Employee name :");
    E_name = in.nextLine();
    boolean validentry = false;
    while(validentry){
        System.out.println("enter the employee number in XXX-L format ");
        E_number = in.nextLine();
        if(!E_number.matches("[0-9]{3}-[A-M]")){
            System.out.println("Invalid Input Try Again! ");
            validentry = false;
        }
        else
        {
            validentry = true;
        }
    }
    System.out.println("Enter the Hire date of Employee :");
    System.out.print("Day :");
    day = in.nextInt();
    System.out.print("Month :");
    month = in.nextInt();
    System.out.println("Year :");
    year = in.nextInt();

    Hd = new Date(day,month,year);
    Hd = new Date(Hd);

    System.out.println("enter the the shift of the worker :");
    shift = in.nextInt();
    while (validentry) 
    {
        if(shift ==1 || shift == 2){
            validentry = true;
        }    
    }
    System.out.println("Enter the hourly pay rate ");
    H_rate = in.nextDouble();
    ProductionWorker p = new ProductionWorker(E_name, E_number, Hd, shift, H_rate);
    System.out.println("Employee name :"+p.get_name());
    System.out.println("Employee number :"+p.get_E_number());
    System.out.println("Hire date :"+Hd.getdate());
    System.out.println("shift"+p.get_shift());
    System.out.println("Hourly pay rate :"+p.get_hourly_pay_rate());

}    
}
