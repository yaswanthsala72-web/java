import java.util.Scanner;

public class RecursivePower
{
    static int power(int base, int exponent)
    {
        // Base case
        if (exponent == 0)
        {
            return 1;
        }

        // Recursive case
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = power(base, exponent);

        System.out.println("Result = " + result);

        sc.close();
    }
}