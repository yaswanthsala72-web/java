import java.util.Scanner;

public class RecursiveFactorial
{
    static int factorial(int n)
    {
        // Base case
        if (n == 0 || n == 1)
        {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial = " + result);

        sc.close();
    }
}