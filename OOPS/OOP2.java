package OOPS;

class Employee
{
    int Salary;
    String name;
    public int get_salary()
    {
        return Salary;
    }
    public String get_name()
    {
        return name;
    }
    public void set_name(String n)
    {
        name = n;
    }
}

public class OOP2 
{
    public static void main(String[] args) 
    {
        Employee obj = new Employee();
        obj.set_name("Isam");
        obj.Salary = 90000;
        System.out.println("name = "+obj.get_name());
        System.out.println("Salary = "+obj.get_salary());
    }    
}
