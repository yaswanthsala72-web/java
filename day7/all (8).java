import java.util.Scanner;

public class StaticMethod
{
    static int square(int n)
    {
        return n * n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = square(n);

        System.out.println("Square = " + result);

        sc.close();
    }
}