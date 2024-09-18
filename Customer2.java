public class Customer2 {
    String customer_Name = "IsamZia";
    String customer_Adress = "Peshawar";
    int customer_Contact = 9932;
    double customer_Balance = 110;

    public void display()
{
    System.out.println("Customer Name: "+ customer_Name);
    System.out.println("Customer Adress: "+ customer_Adress );
    System.out.println("Customer Contact: "+customer_Contact );
    System.out.println("Customer Balance: "+customer_Balance);
}
    public int deposit()
    {
        customer_Balance += 100.0;
        return (int)customer_Balance;
        
    }
    public int deposit_one(int num)
    {
        customer_Balance += num;
        return (int)customer_Balance;
        
    } 
    public double balance()
    {
        return customer_Balance;
    }
    public static void main(String[] args)
    {
        Customer2 obj = new Customer2();
        obj.display();
        int result = obj.deposit();
        System.out.println("Deposit amount : "+result);
        int result2 = obj.deposit_one(10);
        System.out.println("Updated deposit: "+ result2);
        double result3 = obj.balance();
        System.out.println("Balance: "+result3);


    }
    
  
    
}
