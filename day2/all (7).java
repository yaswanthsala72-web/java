import java.util.Scanner;

public class MenuProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 4)
            {
                System.out.println("Program ended");
                break;
            }

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (true);

        sc.close();
    }
}