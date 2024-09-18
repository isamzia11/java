package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array
{
    String name;
    int age;
    int [] score;
    double gpa;
   
    public Array()
    {
        name = "Isam";
        age = 21;
        score = new int[5];
        gpa = 0.0;
    } 
    public void inputscore()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter subject marks :");
        for(int i = 0;i<5;i++)
        {
            score[i] = in.nextInt();;
        }

    }  
    public void calculate()
    {
        double total = Arrays.stream(score).sum();
        gpa = total/500 * 100;
        System.out.println("Gpa is : "+gpa);
    }
    public void display()
    {
        if(gpa>60 && gpa < 72)
        {
            System.out.println(name+" your GPA is 2.5");
        }
        else if (gpa>72 && gpa<80)
        {
            System.out.println(name+" your GPA is 3");
        }
        else if (gpa>80 && gpa <87){
            System.out.println(name+" your GPA is 3.5");
        }
        else if(gpa >87)
        {
            System.out.println(name+" your GPA is 4");
        }
        else{
            if(gpa<60)
            {
                System.out.println(name+" your GPA is 2");
            }
        }

    }
    public static void main(String[] args) 
    {
        Array obj = new Array();
        obj.inputscore();
        obj.calculate();
        obj.display();    
    } 
}
