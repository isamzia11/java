import java.util.Scanner;
public class loops1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = a.nextInt();
        System.out.println("table of "+num);
        int i=1;
        for(; ;)
        {
            if (i<=20){
            System.out.println(num+" = "+ num*i);
        i++;    
        }
        }
    }
}