class Outer
{
    void display()
    {
        int a = 10;

        class Inner
        {
            void show()
            {
                System.out.println("Value of a : " + a);
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.display();
    }
}