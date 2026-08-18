import java.util.Scanner;

public class SubstringExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        String result = str.substring(start, end);

        System.out.println("Substring = " + result);

        sc.close();
    }
}