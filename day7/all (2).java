import java.util.Scanner;

public class SimpleMethod
{
    static void displayMessage()
    {
        System.out.println("Welcome to Java Methods");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        displayMessage();

        sc.close();
    }
}