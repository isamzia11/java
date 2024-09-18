package Production_Worker;

public class ShiftSupervisor extends Employee
{
    double E_anualsalary;
    double yearly_bonus;
    ShiftSupervisor(String E_N,String E_Num,Date Hdate,double a,double y)
    {
        super(E_N, E_Num, Hdate);
        this.E_anualsalary = a;
        this.yearly_bonus = y;
    }
}
