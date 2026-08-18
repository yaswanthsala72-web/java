class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Student(Student s)
    {
        this.name = s.name;
        this.age = s.age;
    }

    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class CopyConstructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Karthick", 22);

        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println();

        System.out.println("Copied Object:");
        s2.display();
    }
}