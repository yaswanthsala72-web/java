import java.util.Scanner;

class CharStack
{
    char[] arr;
    int top;

    CharStack(int size)
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

    char peek()
    {
        return arr[top];
    }
}

public class BalancedParentheses
{
    static boolean isBalanced(String str)
    {
        CharStack stack = new CharStack(str.length());

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}')
            {
                if (stack.isEmpty())
                {
                    return false;
                }

                char open = stack.pop();

                if ((ch == ')' && open != '(') ||
                    (ch == ']' && open != '[') ||
                    (ch == '}' && open != '{'))
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String str = sc.nextLine();

        if (isBalanced(str))
        {
            System.out.println("Balanced Parentheses");
        }
        else
        {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}