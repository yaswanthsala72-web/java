import java.util.Scanner;

public class FinallyExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            System.out.println("Number = " + n);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
        finally
        {
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}