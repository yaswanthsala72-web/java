import java.util.Scanner;

class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class ParameterizedConstructor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student s1 = new Student(name, age);

        s1.display();

        sc.close();
    }
}