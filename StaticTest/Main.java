package StaticTest;

public class Main 
{
public static void main(String[] args) 
{
StaticTest s1 = new StaticTest();
StaticTest s2 = new StaticTest();
System.out.println("s1 values"); 
System.out.println("a = "+s1.getA()+" and"+" b = "+s1.getB()); 
System.out.println("s2 values "); 
System.out.println("a = "+s2.getA()+" and"+" b = "+s2.getB());  
s1.setA(67);
s1.setB(99);

System.out.println("s1 values"); 
System.out.println("a = "+s1.getA()+" and"+" b = "+s1.getB()); 
System.out.println("s2 values "); 
System.out.println("a = "+s2.getA()+" and"+" b = "+s2.getB()); 

}    
}
