import java.util.Scanner;

public class CharAtExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++)
        {
            System.out.println("Character at index " + i + " = " + str.charAt(i));
        }

        sc.close();
    }
}