import java.util.Scanner;

class CNode
{
    int data;
    CNode next;

    CNode(int data)
    {
        this.data = data;
    }
}

public class CircularLinkedList
{
    CNode head;
    CNode tail;

    void insert(int data)
    {
        CNode newNode = new CNode(data);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void display()
    {
        if (head == null)
        {
            return;
        }

        CNode temp = head;

        do
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while (temp != head);

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        CircularLinkedList list = new CircularLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            list.insert(sc.nextInt());
        }

        System.out.println("Circular Linked List:");
        list.display();

        sc.close();
    }
}