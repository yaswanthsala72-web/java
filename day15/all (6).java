import java.util.Scanner;

class RNode
{
    int data;
    RNode next;

    RNode(int data)
    {
        this.data = data;
    }
}

public class ReverseLinkedList
{
    RNode head;

    void insert(int data)
    {
        RNode newNode = new RNode(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        RNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void reverse()
    {
        RNode prev = null;
        RNode current = head;

        while (current != null)
        {
            RNode next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;
    }

    void display()
    {
        RNode temp = head;

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

        ReverseLinkedList list = new ReverseLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            list.insert(sc.nextInt());
        }

        System.out.println("Original:");
        list.display();

        list.reverse();

        System.out.println("Reversed:");
        list.display();

        sc.close();
    }
}