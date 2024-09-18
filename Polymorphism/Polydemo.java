package Polymorphism;

class Animal 
{
    public void Move()
    {
        
    }    
}
class Fish extends Animal
{
    public void Move()
    {
        System.out.println("Fish is swimming ");
    }
}
class Frog extends Animal
{
    public void Move()
    {
        System.out.println("Frog can jump");
    }
}
class Eagle extends Animal
{
    public void Move()
    {
        System.out.println("Eagle can fly");
    }
}
public class Polydemo{
    public static void main(String[] args) {
        Fish F = new Fish();
        Frog Fr = new Frog();
        Eagle E = new Eagle();

        // System.out.println("------------------");
        // F.Move();
        // System.out.println("------------------");
        // Fr.Move();
        // System.out.println("------------------");
        // E.Move();
        // System.out.println("------------------");



        Animal A;
        A=F;
        System.out.println("------------------");
        A.Move();
        A=Fr;
        System.out.println("------------------");
        A.Move();
        A=E;
        System.out.println("------------------");
        A.Move();
        System.out.println("------------------");

    }
}