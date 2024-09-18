package Compostion;

public class Main 
{
    public static void main(String[] args) 
    {
        car mycar = new car();
        mycar.startcar();    
    }
}
class Engine
{
    public void start()
    {
        System.out.println("ENGINE STARTED ");
    }
}
class car
{
    private Engine engine;
    public car(){
        this.engine = new Engine();
    }
    public void startcar()
    {
        engine.start();
        System.out.println("Car Started ");
    }
}