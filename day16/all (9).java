import java.util.Scanner;

class MinStack
{
    int[] arr;
    int[] minArr;

    int top;

    MinStack(int size)
    {
        arr = new int[size];
        minArr = new int[size];

        top = -1;
    }

    void push(int value)
    {
        if (top == arr.length - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }

        top++;

        arr[top] = value;

        if (top == 0)
        {
            minArr[top] = value;
        }
        else
        {
            if (value < minArr[top - 1])
            {
                minArr[top] = value;
            }
            else
            {
                minArr[top] = minArr[top - 1];
            }
        }
    }

    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek()
    {
        if (top == -1)
        {
            return -1;
        }

        return arr[top];
    }

    int getMin()
    {
        if (top == -1)
        {
            return -1;
        }

        return minArr[top];
    }
}

public class MinStackProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        MinStack stack = new MinStack(size);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            stack.push(sc.nextInt());
        }

        System.out.println("Top = " + stack.peek());
        System.out.println("Minimum = " + stack.getMin());

        System.out.println("Popped = " + stack.pop());

        System.out.println("Minimum after pop = " + stack.getMin());

        sc.close();
    }
}