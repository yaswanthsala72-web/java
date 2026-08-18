import java.util.Scanner;

public class CompareToExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        if (result == 0)
        {
            System.out.println("Both strings are equal");
        }
        else if (result < 0)
        {
            System.out.println("First string comes before second string");
        }
        else
        {
            System.out.println("First string comes after second string");
        }

        sc.close();
    }
}