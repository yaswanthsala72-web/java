interface A
{
    default void display()
    {
        System.out.println("Interface A");
    }
}

interface B
{
    default void display()
    {
        System.out.println("Interface B");
    }
}

class Demo implements A, B
{
    @Override
    public void display()
    {
        System.out.println("Demo class");
    }
}

public class DefaultMethodConflict
{
    public static void main(String[] args)
    {
        Demo d = new Demo();

        d.display();
    }
}