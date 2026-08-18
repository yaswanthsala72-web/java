import java.util.Scanner;

public class NumberPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            // Spaces
            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}