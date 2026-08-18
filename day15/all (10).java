import java.util.Scanner;

class PNode
{
    int data;
    PNode next;

    PNode(int data)
    {
        this.data = data;
    }
}

public class PalindromeLinkedList
{
    PNode head;

    void insert(int data)
    {
        PNode newNode = new PNode(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        PNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    boolean isPalindrome()
    {
        PNode slow = head;
        PNode fast = head;

        PNode stack = null;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        PNode secondHalf = slow;

        if (fast != null)
        {
            secondHalf = slow.next;
        }

        while (secondHalf != null)
        {
            PNode newNode = new PNode(secondHalf.data);

            newNode.next = stack;
            stack = newNode;

            secondHalf = secondHalf.next;
        }

        PNode firstHalf = head;

        while (stack != null)
        {
            if (firstHalf.data != stack.data)
            {
                return false;
            }

            firstHalf = firstHalf.next;
            stack = stack.next;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        PalindromeLinkedList list = new PalindromeLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
        {
            list.insert(sc.nextInt());
        }

        if (list.isPalindrome())
        {
            System.out.println("Palindrome Linked List");
        }
        else
        {
            System.out.println("Not a Palindrome Linked List");
        }

        sc.close();
    }
}