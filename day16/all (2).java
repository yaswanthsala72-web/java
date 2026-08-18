import java.util.Scanner;

class Stack
{
    int[] arr;
    int top;

    Stack(int size)
    {
        arr = new int[size];
        top = -1;
    }

    void push(int value)
    {
        if (top == arr.length - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
        System.out.println(value + " pushed");
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
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    void display()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class ArrayStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack:");
        stack.display();

        System.out.println("Top element = " + stack.peek());

        System.out.println("Popped = " + stack.pop());

        System.out.println("After pop:");
        stack.display();

        sc.close();
    }
}