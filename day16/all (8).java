import java.util.Scanner;

class IntStack
{
    int[] arr;
    int top;

    IntStack(int size)
    {
        arr = new int[size];
        top = -1;
    }

    void push(int value)
    {
        arr[++top] = value;
    }

    int pop()
    {
        return arr[top--];
    }

    int peek()
    {
        return arr[top];
    }

    boolean isEmpty()
    {
        return top == -1;
    }
}

public class NextGreaterElement
{
    static void findNextGreater(int[] arr)
    {
        int n = arr.length;

        int[] result = new int[n];

        IntStack stack = new IntStack(n);

        for (int i = n - 1; i >= 0; i--)
        {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
            {
                stack.pop();
            }

            if (stack.isEmpty())
            {
                result[i] = -1;
            }
            else
            {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        System.out.println("Next Greater Elements:");

        for (int i = 0; i < n; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        findNextGreater(arr);

        sc.close();
    }
}