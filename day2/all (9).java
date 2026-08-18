import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tables: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println("\nTable of " + i);

            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        sc.close();
    }
}