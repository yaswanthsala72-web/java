import java.util.Scanner;

public class RecursiveSum
{
    static int sum(int n)
    {
        // Base case
        if (n == 0)
        {
            return 0;
        }

        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));

        sc.close();
    }
}