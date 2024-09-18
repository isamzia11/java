package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_2D
{
   
    static int [] [] flats = new int [2] [3];
    public static void main(String[] args) 
    {
        Array_2D obj = new Array_2D();
        flats[0] [0] = 100;
        flats[0] [1] = 200;
        flats[0] [2] = 300;
        flats[1] [0] = 400;
        flats[1] [1] = 500;
        flats[1] [2] = 600;
        for(int i = 0; i<flats.length;i++)
        {
            for(int j = 0; j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("now reversing the 2D Array ");
        for(int i = flats.length-1; i>=0;i--)
        {
            for(int j = flats[i].length-1; j>=0;j--)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
       obj.Sum();
    } 
    public static void Sum()
    {   Scanner in  = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = in.nextInt();
        System.out.println("enter number of columns");
        int col = in.nextInt();
        int [] [] mat1 = new int[row][col];
        int [] [] mat2 = new int[row][col];
        int [] [] result = new int[row][col];
        System.out.println("enter elemens in matrix 1 :");
        for(int i= 0;i<mat1.length;i++)
        {
            for(int j = 0;j<mat1[i].length;j++)
            {
                mat1 [i][j] = in.nextInt();
            }
        }
        System.out.println("enter elemens in matrix 2 :");
        for(int i= 0;i<mat2.length;i++)
        {
            for(int j = 0;j<mat2[i].length;j++)
            {
                mat2 [i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix 1 elements");
        for(int i = mat1.length-1; i>=0;i--)
        {
            for(int j = mat1[i].length-1; j>=0;j--)
            {
                System.out.print(mat1[i][j]);
                System.out.println(" ");
            }
            System.out.println(" ");

        }  
        System.out.println("Matrix 2 elements");
        for(int i = mat2.length-1; i>=0;i--)
        {
            for(int j = mat2[i].length-1; j>=0;j--)
            {
                System.out.print(mat2[i][j]);
                System.out.println(" ");
            }
        }   
        System.out.println(" Sum of MAtrix 1 & 2 :");
        for(int i=0;i<mat1.length;i++)
        {
            for(int j =0;j<mat1[i].length;j++)
            {
                result [i][j] = mat1[i][j] + mat2 [i][j];
                System.out.println(result[i][j]);
            }
            System.out.println(" ");
        }
       
    }   
}

