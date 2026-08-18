interface Printable
{
    void print();
}

interface Showable
{
    void show();
}

class Document implements Printable, Showable
{
    @Override
    public void print()
    {
        System.out.println("Printing document");
    }

    @Override
    public void show()
    {
        System.out.println("Showing document");
    }
}

public class MultipleInterfaces
{
    public static void main(String[] args)
    {
        Document d = new Document();

        d.print();
        d.show();
    }
}