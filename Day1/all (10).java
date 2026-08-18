public class StudentMarks
{
    public static void main(String[] args)
    {
        int java = 80;
        int python = 75;
        int dbms = 85;
        int html = 90;
        int maths = 70;

        int total = java + python + dbms + html + maths;

        double average = total / 5.0;

        double percentage = (total / 500.0) * 100;

        System.out.println("Java       : " + java);
        System.out.println("Python     : " + python);
        System.out.println("DBMS       : " + dbms);
        System.out.println("HTML       : " + html);
        System.out.println("Maths      : " + maths);

        System.out.println("----------------------");

        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Percentage : " + percentage + "%");
    }
}