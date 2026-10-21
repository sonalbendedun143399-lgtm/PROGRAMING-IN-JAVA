class Outer
{
    interface Inner
    {
        void display();
    }
}

class Demo implements Outer.Inner
{
    public void display()
    {
        System.out.println("Nested Interface Example");
    }

    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.display();
    }
}