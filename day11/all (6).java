import java.util.Scanner;

public class StringBufferOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        sb.append(" Java");

        System.out.println("After append: " + sb);

        sb.insert(0, "Hello ");

        System.out.println("After insert: " + sb);

        sb.delete(0, 6);

        System.out.println("After delete: " + sb);

        sb.reverse();

        System.out.println("After reverse: " + sb);

        sc.close();
    }
}