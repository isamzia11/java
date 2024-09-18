package Hackathon;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {

    String userInput = null;
    System.out.print("Give user name : ");
    Scanner object = new Scanner(System.in);
    userInput = object.nextLine();
    userInput = "https://socialmedia.com/"+userInput;
        System.out.println("your Email is : "+userInput);
    }

}
