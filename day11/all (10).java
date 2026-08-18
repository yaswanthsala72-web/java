import java.util.Scanner;

public class RemoveDuplicateCharacters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            boolean found = false;

            for (int j = 0; j < result.length(); j++)
            {
                if (result.charAt(j) == ch)
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                result.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}