class Animal
{
    String name = "Animal";

    void display()
    {
        System.out.println("Parent Animal");
    }
}

class Dog extends Animal
{
    String name = "Dog";

    void display()
    {
        System.out.println("Child Dog");
    }

    void show()
    {
        System.out.println("Child variable = " + name);
        System.out.println("Parent variable = " + super.name);

        display();
        super.display();
    }
}

public class SuperKeyword
{
    public static void main(String[] args)
    {
        Dog d = new Dog();

        d.show();
    }
}