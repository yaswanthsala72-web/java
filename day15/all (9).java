class ListNode
{
    int data;
    ListNode next;

    ListNode(int data)
    {
        this.data = data;
    }
}

public class MergeSortedLists
{
    static ListNode merge(ListNode first, ListNode second)
    {
        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        while (first != null && second != null)
        {
            if (first.data <= second.data)
            {
                current.next = first;
                first = first.next;
            }
            else
            {
                current.next = second;
                second = second.next;
            }

            current = current.next;
        }

        if (first != null)
        {
            current.next = first;
        }
        else
        {
            current.next = second;
        }

        return dummy.next;
    }

    static void display(ListNode head)
    {
        ListNode temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        ListNode first = new ListNode(10);
        first.next = new ListNode(30);
        first.next.next = new ListNode(50);

        ListNode second = new ListNode(20);
        second.next = new ListNode(40);
        second.next.next = new ListNode(60);

        ListNode result = merge(first, second);

        System.out.println("Merged List:");
        display(result);
    }
}