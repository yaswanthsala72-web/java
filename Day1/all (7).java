public class TypeCasting
{
    public static void main(String[] args)
    {
 
        int a = 10;
        double b = a;

        System.out.println("int value    : " + a);
        System.out.println("double value : " + b);

        double x = 25.75;
        int y = (int) x;

        System.out.println("double value : " + x);
        System.out.println("int value    : " + y);


        char ch = 'A';
        int ascii = ch;

        System.out.println("Character : " + ch);
        System.out.println("ASCII     : " + ascii);

 
        int number = 66;
        char character = (char) number;

        System.out.println("Integer   : " + number);
        System.out.println("Character : " + character);
    }
}