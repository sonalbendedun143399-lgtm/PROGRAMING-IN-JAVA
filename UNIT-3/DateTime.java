import java.util.Calendar;

class DateTime
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date and Time : " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After Adding 5 Days : " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println("After Subtracting 3 Days : " + c.getTime());

        c.add(Calendar.MONTH, 2);
        System.out.println("After Adding 2 Months : " + c.getTime());

        c.add(Calendar.MONTH, -1);
        System.out.println("After Subtracting 1 Month : " + c.getTime());
    }
}