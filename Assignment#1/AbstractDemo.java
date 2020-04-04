abstract class AbstractClassDemo
{
    abstract void printData();
}

class AbstractDemo extends AbstractClassDemo
{
    void printData()
    {
        System.out.println("I'm print data method");
    }

    public static void main (String[] args)
    {
        AbstractDemo abstractDemo = new AbstractDemo();
        abstractDemo.printData();
    }
}