import java.util.Scanner;

public class MultipleCatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            int[] arr = {10, 20, 30};

            System.out.println(arr[n]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic error");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index");
        }
        catch (Exception e)
        {
            System.out.println("Some other exception occurred");
        }

        sc.close();
    }
}