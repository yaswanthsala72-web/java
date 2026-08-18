import java.util.Scanner;

public class MinimumSubarray
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

        int currentSum = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < n; i++)
        {
            if (currentSum + arr[i] < arr[i])
            {
                currentSum = currentSum + arr[i];
            }
            else
            {
                currentSum = arr[i];
            }

            if (currentSum < minSum)
            {
                minSum = currentSum;
            }
        }

        System.out.println("Minimum Subarray Sum = " + minSum);

        sc.close();
    }
}