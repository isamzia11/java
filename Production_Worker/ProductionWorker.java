package Production_Worker;

public class ProductionWorker extends Employee
{
    private int Shift;
    private double Hourly_Pay_Rate;
    ProductionWorker(String n, String E_n,Date hDate,int s,double h)
    {
       super(E_n, E_n,hDate);
        this.Shift = s;
        this.Hourly_Pay_Rate = h;
    }    
    public void set_shift(int s)
    {
        this.Shift = s;
    }
    public int get_shift () 
    {
        return Shift;
    
    }
    public void set_Hourly_pay_rate(double H_pr)
    {
        this.Hourly_Pay_Rate = H_pr;

    }
    public double get_hourly_pay_rate(){
        return Hourly_Pay_Rate;
    }
    
}
