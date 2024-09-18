public class Product 
{
String p_name = "Note Book";
int p_price = 500;
int p_quantity = 10;    
public void display()
{
System.out.println("************ information ************");
System.out.println("product name is :"+p_name);
System.out.println("product price is :"+p_price);
System.out.println("product quantity is :"+p_quantity);
System.out.println("***************************************");
}
public int update_quantity()
{
p_quantity += 100;
return p_quantity;
}
public int total_cost()
{
int total_cost = p_price*p_quantity;
return total_cost;
}
public static void main(String[]args)
{
Product myobj = new Product();
myobj.display();
int result = myobj.update_quantity();
System.out.println(result);
System.out.println();
int payment = myobj.total_cost();
System.out.println(payment);
}
}
