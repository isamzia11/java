package Hackathon;
import java.util.Scanner;

public class Task8 {
    static int baseSQFT = 112;
    static int basePR = 1;
    static int basePP = 0;
    static int baseWHR = 8;
    static double basePay = 36.00;
    static double sq_feet_per_hour = 14;
    static double sq_feet_paint =1.12;
    static Scanner input = new Scanner(System.in);

    static public double PaintReq(int userin){
        double req_paint = userin / sq_feet_paint;
        req_paint = req_paint /100;
        return req_paint;
    }

    static public double Hr_of_Lab(int userin){
       double req_HR =  userin / sq_feet_per_hour;
       return req_HR;
    }

    static double Paint_Cost(int basePP, double req_paint){
        double paint_price = req_paint * basePP;
        return paint_price;
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount of Square Feet and paint per gallon");
        int userin = input.nextInt();
        int basePP = input.nextInt();

        double req_HR = Hr_of_Lab(userin);
        System.out.println("Required hour of labour is: "+req_HR);
        double cost_Labour = req_HR * basePay;
        System.out.println("Labour Charges: "+cost_Labour);
        double req_paint = PaintReq(userin);
        System.out.println("NO of gallons Required: "+req_paint);
        double paint_cost = Paint_Cost(basePP, req_paint);
        System.out.println("Cost of Paint: "+paint_cost);
        System.out.println("Total cost: "+cost_Labour+paint_cost);


    }
    
}
