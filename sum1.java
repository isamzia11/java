import java.util.Scanner;
public class sum1 
{
public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int a,b;
    int Sum = 0;
    System.out.print("enter the first number :");
    a = num.nextInt();
    System.out.print("\nenter the second number :");
    b = num.nextInt();
    Sum = a+b;
    System.out.println("Sum = "+Sum);

}    
}
