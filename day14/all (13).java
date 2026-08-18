public class CheckedUnchecked
{
    public static void main(String[] args)
    {
        // Unchecked Exception
        try
        {
            int result = 10 / 0;

            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Unchecked Exception handled");
        }

        // Checked Exception
        try
        {
            Thread.sleep(1000);

            System.out.println("Checked exception handled");
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted Exception handled");
        }
    }
}