import java.util.Scanner;
public class LoopStudent {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int marks = 0;
        String name;
        int Sum=0;
        int avg=0;
        int j=0;
        for(int i =1; i<=5;i++)
        {
            System.out.print("enter your name :");
            
            name = a.nextLine();
            System.out.println("Name = "+name);
            for(j=1;j<=3;j++)
            {
                System.out.print("enter subject marks :");
                marks = a.nextInt();
                System.out.println("marks = "+marks);
                Sum += marks;
        
            }
            System.out.println("j = "+j);
            avg=Sum/(j-1);
            System.out.println("Student :"+name);
            System.out.println("average marks :"+avg);
            a.nextLine();
        }
    }
    
}
