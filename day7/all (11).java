import java.util.Scanner;

public class MethodCalculator
{
    static int calculate(int a, int b, char operator)
    {
        switch (operator)
        {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b != 0)
                {
                    return a / b;
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }

            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    static double calculate(double a, double b, char operator)
    {
        switch (operator)
        {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b != 0)
                {
                    return a / b;
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }

            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        int result = calculate(a, b, operator);

        System.out.println("Integer Result = " + result);

        System.out.println("\n--- Decimal Calculation ---");

        System.out.print("Enter first decimal number: ");
        double x = sc.nextDouble();

        System.out.print("Enter second decimal number: ");
        double y = sc.nextDouble();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        double decimalResult = calculate(x, y, op);

        System.out.println("Decimal Result = " + decimalResult);

        sc.close();
    }
}