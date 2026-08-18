import java.util.Scanner;

public class LargestTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a > b)
        {
            System.out.println(a + " is largest");
        }
        else if (b > a)
        {
            System.out.println(b + " is largest");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}