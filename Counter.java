public class Counter
 {
    static int x = 0;
    Counter()
    {
        x++;
    }
    void display()
    {
        SOP(x);
    }
    public static void main(String[] args)
    {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();    
    }

    
}
