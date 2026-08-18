import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        // Upper half
        for (int i = 1; i <= rows; i++)
        {
            // Spaces
            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--)
        {
            // Spaces
            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}