import java.util.Scanner;

public class MethodOverloading
{
    static int add(int a, int b)
    {
        return a + b;
    }

    static double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter two decimal numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Integer Sum = " + add(a, b));
        System.out.println("Double Sum = " + add(x, y));

        sc.close();
    }
}