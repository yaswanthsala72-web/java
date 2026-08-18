import java.util.Scanner;

public class DigitFrequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter digit to search: ");
        int search = sc.nextInt();

        int count = 0;

        while (num != 0)
        {
            int digit = num % 10;

            if (digit == search)
            {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Frequency of " + search + " = " + count);

        sc.close();
    }
}