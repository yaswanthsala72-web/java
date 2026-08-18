import java.util.Scanner;

class Employee
{
    String name;
    int salary;

    Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    void display()
    {
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }
}

public class ThisKeyword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        Employee e = new Employee(name, salary);

        e.display();

        sc.close();
    }
}