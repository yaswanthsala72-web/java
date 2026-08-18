interface Vehicle
{
    void start();

    default void message()
    {
        System.out.println("Vehicle is ready");
    }
}

class Car implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car starts");
    }
}

public class InterfaceDefault
{
    public static void main(String[] args)
    {
        Car c = new Car();

        c.start();
        c.message();
    }
}