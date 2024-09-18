package Hackathon;

public class Task4 {

    static int[] ar = new int[101];

    public static void main(String[] args) {
    
        for(int i=1; i<101; i++){
            ar[i] = i;
            if(ar[i]%2 == 0){
                System.out.println(i+ " This number is an even number");
            }
            else{
                if(ar[i]%2 != 0)
                System.out.println(i+ " This number is an odd number");
            }
        }
        }
    }
    

