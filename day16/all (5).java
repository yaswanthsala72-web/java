import java.util.Scanner;

class MyStack
{
    int[] arr;
    int top;

    MyStack(int size)
    {
        arr = new int[size];
        top = -1;
    }

    void push(int value)
    {
        if (top == arr.length - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[++top] = value;
            System.out.println("Element pushed");
        }
    }

    void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Popped = " + arr[top--]);
        }
    }

    void peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Peek = " + arr[top]);
        }
    }
}

public class StackMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        MyStack stack = new MyStack(size);

        int choice;

        do
        {
            System.out.println();
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
        while (choice != 4);

        sc.close();
    }
}