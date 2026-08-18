import java.util.Scanner;

public class ExceptionBestPractice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            if (denominator == 0)
            {
                throw new ArithmeticException("Denominator cannot be zero");
            }

            int result = numerator / denominator;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
}