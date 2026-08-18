class Student
{
    String name;
    int age;

    Student()
    {
        this("Unknown", 0);
    }

    Student(String name)
    {
        this(name, 18);
    }

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

public class ConstructorChaining
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Arun");

        s1.display();

        System.out.println();

        s2.display();
    }
}