import java.util.Scanner;

public class MoveZeros
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int position = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0)
            {
                arr[position] = arr[i];
                position++;
            }
        }

        while (position < n)
        {
            arr[position] = 0;
            position++;
        }

        System.out.println("Array after moving zeros:");

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}