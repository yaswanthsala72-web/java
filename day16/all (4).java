import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}

class LinkedStack
{
    Node top;

    void push(int value)
    {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    int pop()
    {
        if (top == null)
        {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    int peek()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    void display()
    {
        Node temp = top;

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class LinkedListStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        LinkedStack stack = new LinkedStack();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack:");
        stack.display();

        System.out.println("Peek = " + stack.peek());

        System.out.println("Pop = " + stack.pop());

        System.out.println("After pop:");
        stack.display();

        sc.close();
    }
}