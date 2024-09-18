import javax.swing.*;
class Prime
 {
public static void main(String[]args)
{
int x;
String userInput;
userInput = JOptionPane.showInputDialog("Enter a number");
x = Integer.parseInt(userInput);
if(x==1 || x==2 || x==3)
{
  JOptionPane.showMessageDialog(null,x+" Is prime" );

}
else if(x%2==0)
{
    JOptionPane.showMessageDialog(null,x+" Is prime" );
}
   
else
{
boolean prime = true;

for(int i = 3; i<= x/2; i++)
{
    if(x%i==0)
    {
        prime = false;
        break;
    }
}
if(prime)
{
    
  JOptionPane.showMessageDialog(null,x+" Is prime" );
}
else{
    JOptionPane.showMessageDialog(null,x+" Is prime" );
}
}

}
    
}
