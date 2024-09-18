package Abstraction;

import javax.swing.JOptionPane;

abstract class Fruit
{
   abstract void display_details();
}
class Simple_fruit extends Fruit
{
    void display_details()
{System.out.println("Almond :1000, Peanuts,Wallnuts");
System.out.println("Peanuts : 500");
System.out.println("WallNuts : 2000");
}
}
class Aggregate_fruit extends Fruit`
{
    void display_details(){
        System.out.println("Raspberry : 500");
        System.out.println("Blackberry : 700");
    }
}
class Multiple_fruit extends Fruit
{
    void display_details(){
        System.out.println("Pine apple :1000 \n We can get it from nearby fruit shop");
    }
}
public class Main2 
{
    public static void main(String[] args)
    {
        Fruit obj;
        obj =  new Simple_fruit();
        obj.display_details();
        obj = new Aggregate_fruit();
        obj.display_details();
        obj = new Multiple_fruit();
        obj.display_details();
}
}