import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;

        while (temp != 0)
        {
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = num;

        while (temp != 0)
        {
            int digit = temp % 10;

            int power = 1;

            for (int i = 1; i <= digits; i++)
            {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;
        }

        if (sum == original)
        {
            System.out.println(original + " is an Armstrong Number");
        }
        else
        {
            System.out.println(original + " is not an Armstrong Number");
        }

        sc.close();
    }
}