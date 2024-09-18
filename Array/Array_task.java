package Array;

public class Array_task 
{
    static int total=0;
    public static int sum_subject_marks(int []sum)
    {
        for(int i:sum)
        {
            total+=i;
        }
        return total;
    }  
    public static void main(String[] args) 
    {
        int [] subject_marks = {65,70,80,85};   
        int result = sum_subject_marks(subject_marks);
        System.out.println("result = "+result);
    } 
   
}
