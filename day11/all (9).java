public class StringComparison
{
    public static void main(String[] args)
    {
        String str = "Java";

        StringBuffer buffer = new StringBuffer("Java");

        StringBuilder builder = new StringBuilder("Java");

        System.out.println("String        : " + str);
        System.out.println("StringBuffer  : " + buffer);
        System.out.println("StringBuilder : " + builder);

        System.out.println();

        buffer.append(" Programming");
        builder.append(" Programming");

        System.out.println("String after append        : " + str);
        System.out.println("StringBuffer after append  : " + buffer);
        System.out.println("StringBuilder after append : " + builder);
    }
}