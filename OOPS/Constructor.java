package OOPS;

class MyMainEmployee{
   private int id;
    private String name;
    MyMainEmployee()
    {
        id = 20;
        name = "Isam";
    }
    MyMainEmployee(String myname,int myid)
    {
        this.id = myid;
        this.name = myname;           //---------> Simple constructor-------->          |
    }                             //                                               |
    MyMainEmployee(String myname) //                                               |
    {                              //                                              |
        id = 99;                   //                                              |---->Constructor overloading 
        name = myname;           //--> Parameterized constructor------->           |
    }                            //                                                |
                                //                                                 |
                                //                                                 
    public String get_name()     //                                                |
    {                            //------------------------------------->          |
        return name;
    }
    public void set_name(String n)
    {
        this.name=n;
    }
    public int get_id()
    {
        return id;
    }
    public void set_id(int a)
    {
        this.id=a;
    }
}
public class Constructor 
{
    public static void main(String[] args)
    {
        MyMainEmployee obj = new MyMainEmployee("isam",69);
        System.out.println(obj.get_name());
        System.out.println(obj.get_id());

    }    
}
