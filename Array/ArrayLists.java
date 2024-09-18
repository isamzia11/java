package Array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists 
{
    public static void main(String[] args) 
    {
        ArrayList<String> nameList = new ArrayList<String>();
        System.out.println("the array list has "+nameList.size() +" objects stored in it ");
        nameList.add("Apple");
        nameList.add("Banana");
        nameList.add("Mango");
        System.out.println("The Array list has "+ nameList.size()+" Objects in it");
        nameList.add(2,"Strawberry");
        System.out.println(nameList);

        nameList.remove(2);
        System.out.println();
        System.out.println(nameList.get(0)); 
        System.out.println();

        Collections.sort(nameList);
        System.out.println("Sorted :"+nameList);

        System.out.println("Printing ArrayList content one by one \n");
        for(String name :nameList)
        {
            System.out.println(name);
        }

    }    
}
