package OOPS;

public class Employee 
{
    private int salary;
    Employee(int s)
    {
        this.salary = s;
    }    
    public int getsalary()
    {
        return salary;
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee(10000);
        System.out.println("Salary : "+obj.getsalary());    
    }
}
