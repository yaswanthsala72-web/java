import java.util.Scanner;

class DDeleteNode
{
    int data;
    DDeleteNode prev;
    DDeleteNode next;

    DDeleteNode(int data)
    {
        this.data = data;
    }
}

public class DoublyDelete
{
    DDeleteNode head;

    void insert(int data)
    {
        DDeleteNode newNode = new DDeleteNode(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        DDeleteNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void delete(int key)
    {
        DDeleteNode temp = head;

        while (temp != null && temp.data != key)
        {
            temp = temp.next;
        }

        if (temp == null)
        {
            System.out.println("Element not found");
            return;
        }

        if (temp.prev != null)
        {
            temp.prev.next = temp.next;
        }
        else
        {
            head = temp.next;
        }

        if (temp.next != null)
        {
            temp.next.prev = temp.prev;
        }
    }

    void display()
    {
        DDeleteNode temp = head;

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

        DoublyDelete list = new DoublyDelete();

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