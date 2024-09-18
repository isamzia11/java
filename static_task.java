public class static_task 
{
static String C_name = "XGames" ; 
String name = "Isam Zia";  


void showname()
{
System.out.println("your company name is :"+C_name);
System.out.println("your name is : "+name);
}
public static_task(String name)
{
this.name= name;
}
static void dispaly(static_task obj)
{
    
System.out.println("your company name is :"+C_name);
System.out.println("your name is : "+obj.name);
}
public static void main(String[] args)
{
static_task obj = new static_task();
obj.showname();
dispaly();    
}




}
