import java.util.Scanner;

public class BasicRecursion
{
    static void printNumbers(int n)
    {
        // Base case
        if (n == 0)
        {
            return;
        }

        // Recursive case
        printNumbers(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}