package Inheritance;

public class single
{
    public static void main(String[] args)
    {
        Admin_staff cs = new Admin_staff();
        System.out.println(cs.get_name());
        System.out.println(cs.get_allowance());

    }
}
class Teaching_faculty extends Employee
{
    int Teaching_allowance;
    public void set_allowance(int s)
    {
        Teaching_allowance = s;
        s = 10000;
    }
    public int get_allowance()
    {
        return Teaching_allowance;
    }
}
class Admin_staff extends Teaching_faculty
{

}
class Employee
{
    String name = "Ahmad";
    public String get_name()
    {
        return name;
    } 
}
