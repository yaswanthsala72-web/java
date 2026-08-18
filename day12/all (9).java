import java.util.Scanner;

public class RecursiveReverse
{
    static int reverse(int n, int result)
    {
        // Base case
        if (n == 0)
        {
            return result;
        }

        int digit = n % 10;

        result = result * 10 + digit;

        // Recursive case
        return reverse(n / 10, result);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = reverse(n, 0);

        System.out.println("Reverse = " + result);

        sc.close();
    }
}