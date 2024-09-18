package OOPS;

class MyEmployee
{
    private int id;
    private String name;
    public String get_name()
    {
        return name;
    }
    public void set_name(String n)
    {
        name=n;
    }
    public int get_id()
    {
        return id;
    }
    public void set_id(int a)
    {
        id=a;
    }
}
public class AccessModifiers 
{
    public static void main(String[] args) 
    {
        MyEmployee obj = new MyEmployee();
        obj.set_name("Isam");
        System.out.println("name = "+obj.get_name());
        obj.set_id(12);
        System.out.println("ID = "+obj.get_id());
    }    
}
