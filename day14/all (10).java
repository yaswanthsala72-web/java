import java.util.Scanner;

public class ThrowExample
{
    static void checkAge(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try
        {
            checkAge(age);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}