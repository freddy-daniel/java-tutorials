class Polymorphism2
{
    public static void main (String[] args)
    {
        System.out.println("\nPolymorphism in method level");

        Polymorphism2 polymorphism2 = new Polymorphism2();

        System.out.println("\nAdding strings 'Hi ' and 'Freddy'");
        polymorphism2.add("Hi ", "Freddy");

        System.out.println("\nAdding integers 20 and 15");
        polymorphism2.add(20, 15);
    }

    void add(String a, String b)
    {
        System.out.println(a.concat(b));
    }

    void add(int a, int b)
    {
        System.out.println(a + b);
    }
}