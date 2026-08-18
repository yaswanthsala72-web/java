class FNode
{
    int data;
    FNode next;

    FNode(int data)
    {
        this.data = data;
    }
}

public class DetectCycle
{
    static boolean hasCycle(FNode head)
    {
        FNode slow = head;
        FNode fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        FNode first = new FNode(10);
        FNode second = new FNode(20);
        FNode third = new FNode(30);
        FNode fourth = new FNode(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle
        fourth.next = second;

        if (hasCycle(first))
        {
            System.out.println("Cycle detected");
        }
        else
        {
            System.out.println("No cycle");
        }
    }
}