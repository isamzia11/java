package Hackathon;

import java.util.Scanner;

import static javax.xml.bind.DatatypeConveter.parseInt;

public class Task5 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.print("How many hours did the Worker work? : ");
        String hoursWorkedInput = object.nextLine();
        object.nextLine();//buffer empty
        int hoursWorkedNumber = parseInt(hoursWorkedInput);

        System.out.print("Whats the hourly pay rate : ");
        double hourlyPayRate = object.nextDouble();
        double Result;
        Result = computePay(hoursWorkedNumber , hourlyPayRate);

//      Enter he amount of hours worked and then press Enter twice so that the
//      Buffer for String Empties

       System.out.println("The Total Pay is : "+ Result );

    }

    public static double computePay(int hours, double rPH)
    {
        double result = 0;
        if (hours > 40)
        {
            int extraHours = hours - 40;

            result = extraHours * (rPH / 2) + hours * rPH;
        }
        else
        {
            result = hours * rPH;
        }
        return result;


    }
}
