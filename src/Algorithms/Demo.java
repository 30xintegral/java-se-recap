package Algorithms;

public class Demo {
    int x = 10;
    int y = 20;

    int display(Demo a, Demo b)
    {
        // Updating value using argument
        a.x = 95;

        System.out.println("x = " + x);

        System.out.println("y = " + y);

        return 0;
    }
    public static void main(String[] args)
    {
        Demo c = new Demo();

        Demo d = new Demo();

        // updating value using primary reference
        // variable
        d.y = 55;

        c.display(c, d); // POINT 1

        d.display(c, d); // POINT 2
        Runtime.getRuntime().gc();
    }
}
