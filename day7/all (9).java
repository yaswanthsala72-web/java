import java.util.Scanner;

public class InstanceMethod
{
    int cube(int n)
    {
        return n * n * n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        InstanceMethod obj = new InstanceMethod();

        int result = obj.cube(n);

        System.out.println("Cube = " + result);

        sc.close();
    }
}