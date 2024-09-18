package Abstraction;

import javax.swing.JOptionPane;

abstract class  Bank 
{
abstract int getinterestrate();
    
}
class City extends Bank
{
    @Override
    int getinterestrate() {
        return 7;
    }
}
class HSBC extends Bank{
    @Override
    int getinterestrate() {
        return 6;
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Bank b;
        b = new City();
        
        JOptionPane.showMessageDialog(null," city rate of interest is :"+b.getinterestrate() );

        b = new HSBC();
           
        JOptionPane.showMessageDialog(null," HSBC rate of interest is :"+b.getinterestrate() );
    }
}
