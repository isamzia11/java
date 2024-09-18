package Hackathon;
import java.util.Scanner;

public class Task3 {
    static String[] ar = {"Ronit"};
    static String[] pass = {"PAnini"};
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Username and Password");
        String username = input.nextLine();
        input.nextLine();
        String password = input.nextLine();
        if (username.equals(ar[0]) && password.equals(pass[0])) {   
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed!");
        }
    }
    
}
