import java.util.Scanner;

public class MethodParameters
{
    static void add(int a, int b)
    {
        int sum = a + b;

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        add(a, b);

        sc.close();
    }
}