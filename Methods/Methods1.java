package Methods;
import java.util.Scanner;
public class Methods1 
{
    public static int logic(int x,int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) 
    {   
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int c= logic(a, b);
        System.out.println(c);

    }    
}
