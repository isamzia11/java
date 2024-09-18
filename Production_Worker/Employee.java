package Production_Worker;

public class Employee 
{
    private String E_Name;
    private String E_Number;
    Date Hdate;
    Employee(String E_Name, String E_Number,Date d)
    {
        this.E_Name = E_Name;
        this.E_Number = E_Number;
        this.Hdate = new Date(d);
    }    
    public void set_name(String E_Name)
    {
        this.E_Name = E_Name;
    }
    public  String get_name()
    {
        return E_Name;
    }
    public void set_E_number(String E_Number)
    {
        this.E_Number = E_Number;
    }
    public  String get_E_number()
    {
        return E_Number;
    }
    

}
