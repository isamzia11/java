package Production_Worker;

public class Date 
{
    private int Day;
    private int Month;
    private int Year;  
    Date(int d,int m,int y)
    {
        this.Day = d;
        this.Month = m;
        this.Year = y;
    }
    Date(Date d)
    {
        this.Day = d.Day;
        this.Month = d.Month;
        this.Year = d.Year;
    }
    public void set_date(int d){
        this.Day = d;
    }
    public void set_month(int m)
    {
        this.Month = m;
    } 
    public void set_year(int y){
        this.Year = y;
    }
    public int get_day()
    {
        return Day;
    }
    public int get_month(){
        return Month;
    }
    public int get_year()
    {
        return Year;
    }
    public String getdate()
    {
        return Day +"/"+Month+"/"+Year;
    }
    
}
