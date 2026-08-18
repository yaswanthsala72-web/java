import java.util.Scanner;

public class ThrowsExample
{
    static void checkNumber(int n) throws Exception
    {
        if (n < 0)
        {
            throw new Exception("Negative number is not allowed");
        }

        System.out.println("Valid number");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        try
        {
            checkNumber(n);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}