import java.util.Scanner;

public class RemoveDuplicates
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

        int[] result = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++)
        {
            boolean found = false;

            for (int j = 0; j < size; j++)
            {
                if (arr[i] == result[j])
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++)
        {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}