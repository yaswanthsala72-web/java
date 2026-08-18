public class SimpleInterest
{
    public static void main(String[] args)
    {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal       : " + principal);
        System.out.println("Rate            : " + rate);
        System.out.println("Time            : " + time);
        System.out.println("Simple Interest : " + simpleInterest);
    }
}