import java.util.Scanner;
import java.util.Arrays;

public class ArraysSearch
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

        Arrays.sort(arr);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = Arrays.binarySearch(arr, key);

        if (result >= 0)
        {
            System.out.println("Element found at index: " + result);
        }
        else
        {
            System.out.println("Element not found");
        }

        sc.close();
    }
}