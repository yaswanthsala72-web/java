import java.util.Scanner;

class StackADT
{
    int[] arr;
    int top;

    StackADT(int size)
    {
        arr = new int[size];
        top = -1;
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    boolean isFull()
    {
        return top == arr.length - 1;
    }

    void push(int value)
    {
        if (isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    int size()
    {
        return top + 1;
    }

    void display()
    {
        if (isEmpty())
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

public class StackOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        StackADT stack = new StackADT(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.display();

        System.out.println("Peek = " + stack.peek());

        System.out.println("Pop = " + stack.pop());

        System.out.println("Stack size = " + stack.size());

        System.out.println("After pop:");
        stack.display();

        sc.close();
    }
}