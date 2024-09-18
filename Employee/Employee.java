package Employee;

public class Employee 
{
    int salary = 1000;
    Employee(int x)
    {
        salary = x;
    }    
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1000);
        Employee e2 = new Employee(2000);
        
        System.out.println("E1 salary = "+e1.salary);
        System.out.println("E2 salary = "+e2.salary);

        e1 = e2;
        System.out.println("E1 salary = "+e1.salary);
        System.out.println("E2 salary = "+e2.salary);
    }
        
}
