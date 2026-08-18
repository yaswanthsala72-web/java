import java.util.Scanner;

class OperatorStack
{
    char[] arr;
    int top;

    OperatorStack(int size)
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

    char peek()
    {
        return arr[top];
    }

    boolean isEmpty()
    {
        return top == -1;
    }
}

public class InfixToPostfix
{
    static int precedence(char ch)
    {
        if (ch == '+' || ch == '-')
        {
            return 1;
        }

        if (ch == '*' || ch == '/')
        {
            return 2;
        }

        if (ch == '^')
        {
            return 3;
        }

        return 0;
    }

    static String convert(String infix)
    {
        OperatorStack stack = new OperatorStack(infix.length());

        String result = "";

        for (int i = 0; i < infix.length(); i++)
        {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch))
            {
                result = result + ch;
            }
            else if (ch == '(')
            {
                stack.push(ch);
            }
            else if (ch == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    result = result + stack.pop();
                }

                stack.pop();
            }
            else
            {
                while (!stack.isEmpty() &&
                       precedence(stack.peek()) >= precedence(ch))
                {
                    result = result + stack.pop();
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
        {
            result = result + stack.pop();
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();

        System.out.println("Postfix = " + convert(infix));

        sc.close();
    }
}