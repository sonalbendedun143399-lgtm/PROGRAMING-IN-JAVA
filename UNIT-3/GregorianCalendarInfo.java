import java.util.GregorianCalendar;

class GregorianCalendarInfo
{
    public static void main(String args[])
    {
        GregorianCalendar c = new GregorianCalendar();

        System.out.println("Date : " + c.get(GregorianCalendar.DATE));
        System.out.println("Month : " + (c.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Year : " + c.get(GregorianCalendar.YEAR));
        System.out.println("Hour : " + c.get(GregorianCalendar.HOUR));
        System.out.println("Minute : " + c.get(GregorianCalendar.MINUTE));
        System.out.println("Second : " + c.get(GregorianCalendar.SECOND));
        System.out.println("Day of Week : " + c.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("Leap Year : " + c.isLeapYear(c.get(GregorianCalendar.YEAR)));
    }
}