import java.util.Scanner;

class AgeException extends Exception
{
    AgeException(String message)
    {
        super(message);
    }
}

public class CustomException
{
    static void checkAge(int age) throws AgeException
    {
        if (age < 18)
        {
            throw new AgeException("Age must be 18 or above");
        }

        System.out.println("Eligible");
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
        catch (AgeException e)
        {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        sc.close();
    }
}