class Student
{
    String name;
    static String college = "ABC College";

    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("College = " + college);
    }
}

public class StaticInstance
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Arun";
        s2.name = "Kumar";

        s1.display();
        System.out.println();

        s2.display();
    }
}