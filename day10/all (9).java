import java.util.Scanner;

public class FindWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int index = str.indexOf(word);

        if (index != -1)
        {
            System.out.println("Word found at index: " + index);

            String result = str.substring(index, index + word.length());

            System.out.println("Found word = " + result);
        }
        else
        {
            System.out.println("Word not found");
        }

        sc.close();
    }
}