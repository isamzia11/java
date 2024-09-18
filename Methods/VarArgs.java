package Methods;

public class VarArgs 
{
    public static int sum(int ...arr)
    {
        int result = 0;
        for(int element:arr)
        {
            result += element;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        System.out.println("Sum = "+sum(1,45,67,8));
    }    
}
