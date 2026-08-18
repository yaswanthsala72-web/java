import java.util.Scanner;

public class IndexOfExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);

        int index = str.indexOf(ch);

        if (index != -1)
        {
            System.out.println("Character found at index: " + index);
        }
        else
        {
            System.out.println("Character not found");
        }

        sc.close();
    }
}