public class Business 
{
static String item_code = "83cc";
static int item_cost_price = 500;
static String expiry_date = "5 March";

static void display()
{
System.out.println("the item code is : "+item_code);
System.out.println("the item original price is : "+ item_cost_price);
System.out.println("the selling price of the product is :"+selling_price());
System.out.println("your item price is after dicount :"+ sale());
System.out.println("the discount you got was : "+discount());
}
static double selling_price()
{
 return item_cost_price+ item_cost_price*0.1 ;
}
static double discount()
{
return  selling_price()*0.05;
}
static double sale(){
return selling_price()-discount();
}

static void expiry()
{
System.out.println("the product will be expired at  : "+expiry_date );
}
public static void main(String[] args)
 {
    display();
    expiry();
}
}
