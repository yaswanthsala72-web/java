import java.util.Scanner;

public class DeleteNode
{
    Node head;

    void insert(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void delete(int key)
    {
        if (head == null)
        {
            return;
        }

        if (head.data == key)
        {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key)
        {
            temp = temp.next;
        }

        if (temp.next != null)
        {
            temp.next = temp.next.next;
        }
    }

    void display()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        DeleteNode list = new DeleteNode();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            list.insert(sc.nextInt());
        }

        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();

        list.delete(key);

        System.out.println("After deletion:");
        list.display();

        sc.close();
    }
}

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}