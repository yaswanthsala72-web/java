import java.util.Scanner;

class MNode
{
    int data;
    MNode next;

    MNode(int data)
    {
        this.data = data;
    }
}

public class MiddleNode
{
    MNode head;

    void insert(int data)
    {
        MNode newNode = new MNode(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        MNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void findMiddle()
    {
        MNode slow = head;
        MNode fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle = " + slow.data);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        MiddleNode list = new MiddleNode();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            list.insert(sc.nextInt());
        }

        list.findMiddle();

        sc.close();
    }
}