class Employee
{
    private int salary = 30000;

    int age = 25;

    protected String department = "IT";

    public String name = "Karthick";

    void display()
    {
        System.out.println("Salary = " + salary);
        System.out.println("Age = " + age);
        System.out.println("Department = " + department);
        System.out.println("Name = " + name);
    }
}

public class AccessModifiers
{
    public static void main(String[] args)
    {
        Employee e = new Employee();

        e.display();

        System.out.println("Name = " + e.name);
        System.out.println("Age = " + e.age);
        System.out.println("Department = " + e.department);
    }
}