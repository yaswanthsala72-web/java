import java.util.Scanner;

class StringStack
{
    char[] arr;
    int top;

    StringStack(int size)
    {
        arr = new char[size];
        top = -1;
    }

    void push(char ch)
    {
        arr[++top] = ch;
    }

    char pop()
    {
        return arr[top--];
    }

    boolean isEmpty()
    {
        return top == -1;
    }
}

public class ReverseUsingStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringStack stack = new StringStack(str.length());

        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }

        System.out.print("Reversed string: ");

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }

        sc.close();
    }
}