import java.util.Scanner;

class DNode
{
    int data;
    DNode prev;
    DNode next;

    DNode(int data)
    {
        this.data = data;
    }
}

public class DoublyLinkedList
{
    DNode head;

    void insert(int data)
    {
        DNode newNode = new DNode(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        DNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void displayForward()
    {
        DNode temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    void displayBackward()
    {
        if (head == null)
        {
            return;
        }

        DNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            list.insert(sc.nextInt());
        }

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();

        sc.close();
    }
}