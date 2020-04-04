class A
{
    A ()
    {
        System.out.println("I am class A");
    }
}

class B extends A
{
    B ()
    {
        System.out.println("I am class B");
    }
}

class C extends B
{
    C ()
    {
        System.out.println("I am class C");
    }
}

class Multilevel
{
    public static void main (String[] args)
    {
        System.out.println("Multilevel Inheritance ");
        new C();
    }
}
