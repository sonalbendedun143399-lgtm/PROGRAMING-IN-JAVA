class TestThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Name : " + getName());
        System.out.println("Thread Priority : " + getPriority());
    }

    public static void main(String args[])
    {
        TestThread t = new TestThread();

        t.setName("MyThread");
        t.setPriority(8);

        t.start();
    }
}