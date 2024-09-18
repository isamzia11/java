package ReadingSimplifier;
import java.io.*;
public class ReadingSimplifier 
{
    public static void main(String[] args) 
    {
        String name = readstring("enter your name :");
        int age = readint("enter your age :");
        System.out.println("Welcome "+name);
        System.out.println("your birth year is "+(2024-age));    
    }
    static String readstring(String message)
    {
        System.out.println(message);
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = in.readLine();
            return input;
        }
        catch(Exception e){}
        return "";
    }
    static int readint(String message)
    {
        String input = readstring(message);
        return Integer.parseInt(input);
    }
}
