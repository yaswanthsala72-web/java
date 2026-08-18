import java.util.Scanner;

class CharNode
{
    char data;
    CharNode next;

    CharNode(char data)
    {
        this.data = data;
    }
}

class CharacterStack
{
    CharNode top;

    void push(char ch)
    {
        CharNode newNode = new CharNode(ch);

        newNode.next = top;
        top = newNode;
    }

    char pop()
    {
        if (top == null)
        {
            return '\0';
        }

        char value = top.data;

        top = top.next;

        return value;
    }

    char peek()
    {
        if (top == null)
        {
            return '\0';
        }

        return top.data;
    }

    boolean isEmpty()
    {
        return top == null;
    }
}

public class CharacterLinkedStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        CharacterStack stack = new CharacterStack();

        System.out.print("Enter characters: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }

        System.out.println("Reverse:");

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }

        sc.close();
    }
}