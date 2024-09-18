package Inheritance;

import java.util.jar.Attributes.Name;

public class Employee 
{
    private String name;
    private int id;
    private double Salary;  

public Employee(String N, int id , double sal)
{
    name = N;
    id = id;
    Salary = sal;
}
public void setSalary(double sal)
{
    Salary = sal;
}
public double getSalary()
{
    return Salary;
}
public void showEmpDetails()
{
    System.out.println("Name :"+ name);
    System.out.println("ID :"+ id);
    System.out.println("Salary :"+ Salary);
}
}