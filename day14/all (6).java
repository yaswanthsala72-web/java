import java.io.Serializable;

class Student implements Serializable
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

public class MarkerInterface
{
    public static void main(String[] args)
    {
        Student s = new Student("Karthick", 22);

        s.display();

        if (s instanceof Serializable)
        {
            System.out.println("Student is Serializable");
        }
    }
}