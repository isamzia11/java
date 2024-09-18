package OOPS;
import java.util.Scanner;
class Employee
{
    int id;          // ----------> These two are the attributes of employee class
    String name;
    int salary;
    public void printdetails()
    {
        System.out.println("employee id : "+id);
        System.out.println("employee name : "+name);
    }
    public int salary()
    {
        return salary;
    }
}

public class OOP1 
{
    public static void main(String[] args) 
    {
        Employee obj = new Employee();
        Scanner in = new Scanner(System.in);
        System.out.println("enter employee id :");
        obj.id = in.nextInt();
        System.out.println("enter employee name");
        in.nextLine();
        obj.name = in.nextLine();

        // System.out.println("Employee "+obj.name+" has id :"+obj.id);
        
        System.out.println("enter salary :");
        obj.salary = in.nextInt();
        int salary = obj.salary();
        System.out.println();
        obj.printdetails();
        System.out.println("Salary  = "+salary);

    }    
}
