package Loops;
import java.util.Scanner;
public class Loops1 
{
    static int num;
    static int range;
    public static void main(String[] args) 
{   
    Scanner in = new Scanner(System.in);
    while(true)
    {
    System.out.println("enter a number whos table you want to print :");
    num = in.nextInt();
    System.out.println("enter your range :");
    range = in.nextInt();
    System.out.println("print a table for "+num);
    
        for(int i = 1;i <= range;i++)
        {
        System.out.println(num+" X "+i+" = "+num*i);
        }
        
        in.nextLine();
   
   while(true)
   {
    System.out.println("do you want to another table ?"); 
        String choose = in.nextLine().toLowerCase();
        if(choose.equals("y"))
        {
            break;
        }
        else if(choose.equals("n"))
        {
            return;
        }
        else
        {
            System.out.println("entered an invalid input ");
        }
        }
    }
    }
}

      

