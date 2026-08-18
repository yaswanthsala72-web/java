import java.util.Scanner;

public class StaticInstance
{
    static int add(int a, int b)
    {
        return a + b;
    }

    int multiply(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calling static method directly
        int sum = add(a, b);

        // Creating object for instance method
        StaticInstance obj = new StaticInstance();

        int product = obj.multiply(a, b);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        sc.close();
    }
}